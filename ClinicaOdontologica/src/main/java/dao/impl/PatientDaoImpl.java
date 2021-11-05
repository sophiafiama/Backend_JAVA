package dao.impl;

import dao.ConfigJDBC;
import dao.IDao;
import model.Address;
import model.Patient;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class PatientDaoImpl implements IDao<Patient> {

    private ConfigJDBC CFG_JBDC;
    final static Logger log = Logger.getLogger(PatientDaoImpl.class);

    public PatientDaoImpl(ConfigJDBC CFG_JBDC) {
        this.CFG_JBDC = CFG_JBDC;
    }

    @Override
    public Patient save(Patient patient) {
        log.debug("Registrando um novo paciente: " + patient.toString());
        Connection connection = CFG_JBDC.connectionDB();
        Statement statement = null;
        String query = String.format("" +
                "INSERT INTO PATIENTS(name, last_name, rg, registered_date, address_id) " +
                "VALUES('%s', '%s', '%s', '%s', '%s')", patient.getName(), patient.getLastname(),
                patient.getRg(), patient.getRegisteredDate(), patient.getAddress().getId());

        try {

            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if(keys.next())
                patient.setId(keys.getInt(1));
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return patient;
    }

    @Override
    public Patient search(Integer id) {
        log.debug("Procurando o paciente de id: " + id);
        Connection connection = CFG_JBDC.connectionDB();
        Statement statement = null;
        String query = String.format("" +
                "SELECT * FROM PATIENTS WHERE id=%s", id);
        Patient patient = null;

        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next()) {
                String queryAddress = String.format("" +
                        "SELECT * FROM ADDRESSES WHERE id=%s", rs.getInt("address_id"));
                Statement statementAddress = connection.createStatement();
                ResultSet rsAddress = statementAddress.executeQuery(queryAddress);
                Address address = null;
                if(rsAddress.next()) {
                    address = new Address(
                            rsAddress.getInt("id"),
                            rsAddress.getString("street"),
                            rsAddress.getInt("number"),
                            rsAddress.getString("city"),
                            rsAddress.getString("state")
                    );
                }
                patient = new Patient(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("last_name"),
                        rs.getString("rg"),
                        rs.getString("registered_date"),
                        address
                );
                statementAddress.close();
            }
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.debug("Paciente de id " + id + " encontrado: " + patient.toString());
        return patient;
    }

    @Override
    public void delete(Patient patient) {
        log.debug("Deletando paciente de nome: " + patient.getName() + " " + patient.getLastname());
        Connection connection = CFG_JBDC.connectionDB();
        Statement statement = null;
        String query = String.format("" +
                "DELETE FROM PATIENT WHERE id=%s", patient.getId());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public Patient update(Patient patient) {
        Connection connection = CFG_JBDC.connectionDB();
        Statement statement = null;
        String query = String.format("");
        return null;
    }

}
