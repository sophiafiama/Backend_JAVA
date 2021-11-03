package Integradores.Aula0012;

import org.apache.log4j.Logger;


public class Main {

    private static final String Create_Table ="DROP TABLE IF TABLE EXISTS USUARIO;"+
            "CREATE TABLE USUARIO(" +
            "ID INT PRIMARY KEY, "+
            "PRIMEIRO_NOME varchar(100) NOT NULL," +
            "SOBRENOME varchar(100) NOT NULL, "+
            "IDADE INT NOT NULL)";

    private static  final String sqlInsert = "INSERT INTO USUARIO (ID, PRIMEIRO_NOME, SOBRENOME, IDADE)" +
            "VALUES(1, 'MARIA', 'SILVA', 29)";
    private static  final String sqlInsert2 = "INSERT INTO USUARIO (ID, PRIMEIRO_NOME, SOBRENOME, IDADE)" +
            "VALUES(2, 'SOPHIA', 'FIAMA', 30)";
    private static  final String sqlInsert3 = "INSERT INTO USUARIO (ID, PRIMEIRO_NOME, SOBRENOME, IDADE)" +
            "VALUES(3, 'PAMELA', 'GODOY', 31)";

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

    }
}
