package dao.impl;

import dao.ConfigJDBC;
import dao.IDao;
import model.Dentist;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DentistDaoImpl implements IDao<Dentist> {

    private ConfigJDBC CFG_JBDC;
    private final static Logger log = Logger.getLogger(DentistDaoImpl.class);

    public DentistDaoImpl() {

        this.CFG_JBDC = new ConfigJDBC();
    }

    @Override
    public Dentist save(Dentist dentist) {
        log.debug("Cadastrando o dentista: " + dentist.toString());
        Connection connection = CFG_JBDC.connectionDB();
        Statement statement = null;
        String query = String.format("" +
                "INSERT INTO DENTISTS (registration, name, lastname)" +
                "VALUES('%s', '%s', '%s')", dentist.getRegistration(),
                dentist.getName(), dentist.getLastname()
        );

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if(keys.next())
                dentist.setId(keys.getInt(1));
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dentist;
    }

    @Override
    public Dentist search(Integer id) {
        log.debug("Procurando o dentista de id " + id);
        Connection connection = CFG_JBDC.connectionDB();
        Statement statement = null;
        String query = String.format("" +
                "SELECT * FROM DENTISTS WHERE id=%s", id
        );
        Dentist dentist = null;

        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next()) {
                dentist = new Dentist(
                        rs.getInt("id"),
                        rs.getString("registration"),
                        rs.getString("name"),
                        rs.getString("lastname")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dentist;
    }

    @Override
    public List<Dentist> searchAll() {
        Connection connection = CFG_JBDC.connectionDB();
        Statement statement = null;
        String query = String.format(""+
                "SELECT * FROM DENTISTS;");

        List<Dentist> dentists = new ArrayList<>();

        try{
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            log.debug("Mostrando lista de dentistas");

            while (rs.next()){
                Dentist dentist = new Dentist(
                        rs.getInt("id"),
                        rs.getString("registration"),
                        rs.getString("name"),
                        rs.getString("lastname")
                );
                dentists.add(dentist);
                log.debug(dentist.toString());
            }

        }catch (Exception e){

            e.printStackTrace();

        }
        return dentists;
    }

    @Override

    public void delete(Dentist dentist) {
        log.debug("Deletando o dentist: " + dentist.toString());
        Connection connection = CFG_JBDC.connectionDB();
        Statement statement = null;
        String query = String.format("" +
                "DELETE FROM DENTISTS WHERE id=%s", dentist.getId());

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
    public Dentist update(Dentist dentist) {
        return null;
    }
}
