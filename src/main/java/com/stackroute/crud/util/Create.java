package com.stackroute.crud.util;

import java.sql.*;

public class Create {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public void createOperation(int id, String name, int age, String gender){

        //Load the required drivers
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //Try to create a connection with your database
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "Root@123");
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO employee VALUES ('"+id+"','"+name+"','"+age+"','"+gender+"')");) {
//
            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println(rowsAffected + " rows inserted");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
