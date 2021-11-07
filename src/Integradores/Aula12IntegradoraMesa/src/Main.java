package Integradores.Aula12IntegradoraMesa.src;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

public class Main {

    // CRIAÇÃO DA TABELA

    private static final String CREATE_TABLE = "DROP TABLE IF EXISTS FUNCIONARIO;" +
            "CREATE TABLE FUNCIONARIO(" +
            "ID INT PRIMARY KEY, " +
            "NOME varchar(100) NOT NULL," +
            "SOBRENOME varchar(100) NOT NULL," +
            "CARGO varchar(50) NOT NULL," +
            "EMAIL varchar(50) NOT NULL)";

    // INSERINDO OS DADOS NA TABELA

    private static final String sqlInsert1 = "INSERT INTO FUNCIONARIO(ID, NOME, SOBRENOME, CARGO, EMAIL) " +
            "VALUES (1, 'Heloisa', 'Lopes','Arquiteta','heloisa@mail.com')";
    private static final String sqlInsert2 = "INSERT INTO FUNCIONARIO(ID, NOME, SOBRENOME, CARGO, EMAIL) " +
            "VALUES (2, 'Amanda', 'Terra','Scrum','amanda@mail.com')";
    private static final String sqlInsert3 = "INSERT INTO FUNCIONARIO(ID, NOME, SOBRENOME, CARGO, EMAIL) " +
            "VALUES (3, 'Rodrigo', 'Menezes','TI','rodrigo@mail.com')";
    private static final String sqlInsert4 = "INSERT INTO FUNCIONARIO(ID, NOME, SOBRENOME, CARGO, EMAIL) " +
            "VALUES (3, 'Marcelo', 'Dimas','TI','marcelo@mail.com')";

    //UPDATE DE DADO

    private static final String Update = "UPDATE FUNCIONARIO SET SOBRENOME='Simas' WHERE SOBRENOME='Dimas'";

    // DELETAR DADO

    private static final String Delete1 = "DELETE FROM FUNCIONARIO WHERE ID=3";
    private static final String Delete2 = "DELETE FROM FUNCIONARIO WHERE EMAIL='amanda@mail.com'";

    //LOGGER

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {

        // LÓGICA

        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();

            // EXECUTAR QUERY DE CRIAR TABELA
            statement.execute(CREATE_TABLE);

            // PREENCHER A TABELA
            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);
            statement.execute(sqlInsert4);

            //logger.info("Unique index or primary key violation");

        } catch (SQLIntegrityConstraintViolationException e) {
            logger.error("Id duplicado");
        }

        //atualizando um dos funcionários e atualizando com um debug as informações;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            
            //UPDATE de informação

            statement.execute(Update);
            logger.debug("O sobrenome do funcionário de ID 3 foi atualizado: " + sqlInsert4 + Update);
            logger.info("O sobrenome do funcionário de ID 3 foi atualizado: " + sqlInsert4 + Update);

            //excluindo um funcionário de acordo com o id;

            statement.execute(Delete1);
            logger.info("O funcionário de ID 3 foi excluído: " + sqlInsert3);

            //excluindo um funcionário usando como critério outra coluna;

            statement.execute(Delete2);
            logger.info("O funcionário cujo primeiro nome é 'Amanda' foi excluído: " + sqlInsert2);

        }catch(Exception e){
                e.printStackTrace();
            } finally {
                if (connection == null)
                    return;

                connection.close();
            }

        }

        // CRIAR O MÉTODO DE CONEXÃO EXTERNA

        public static Connection getConnection () throws Exception {
            Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
            return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }

}