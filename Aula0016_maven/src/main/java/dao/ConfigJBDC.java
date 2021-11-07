package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConfigJBDC {
    private String jbdcDriver;
    private String BD_URL;
    private String usuario;
    private String senha;

    private static final String SQL_CREATE_TABLE_PACIENTE = ""+
            "DROP TABLE IF EXISTS PACIENTE;"+
            "CREATE TABLE PACIENTE"+
            "(id int AUTO_INCREMENT PRIMARY KEY,"+
            "nome VARCHAR(250),"+
            "sobrenome VARCHAR(250),"+
            "rg VARCHAR(250),"+
            "data_registro VARCHAR(8), "+
            "enderecoID int" +
            "FOREIGN KEY(enderecoID) REFERENCES ENDERECO(id));";

    private static final String SQL_CREATE_TABLE_ENDERECO = ""+
            "DROP TABLE IF EXISTS ENDERECO;"+
            "CREATE TABLE ENDERECO"+
            "(id int AUTO_INCREMENT PRIMARY KEY,"+
            "rua VARCHAR(250),"+
            "numero int,"+
            "cidade VARCHAR(50),"+
            "estato VARCHAR(50)";

    public ConfigJBDC() {

        this.jbdcDriver = "org.h2.Driver";
        this.BD_URL= "jdbc:h2:~/test";
        this.usuario= "sa";
        this.senha= "";

    }

    public void criarTabela(){
        try{

            Connection connection = conectarBanco();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE_PACIENTE);
            statement.execute(SQL_CREATE_TABLE_ENDERECO);
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private Connection conectarBanco(){
        Connection connection =null;
    try{
        connection = DriverManager.getConnection(BD_URL,usuario,senha);
    } catch(Exception e){
        e.printStackTrace();
    }
    return connection;
    };

}
