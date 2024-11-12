package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTutorial {
    public static void main(String[] args) {
        String url = "jdbc:h2:tcp://localhost/D:/Tools/h2/database/samples/db";
        String user = "sa";
        String password = "";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            String query = "SELECT * FROM POKEMON ";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("ID"));
                System.out.println("NAME: " + resultSet.getString("NAME"));
                System.out.println("POKEMON TYPE ID: " + resultSet.getInt("POKEMONTYPE_ID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
