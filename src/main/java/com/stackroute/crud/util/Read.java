package com.stackroute.crud.util;

import java.sql.*;

public class Read {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public void readOperation(){

        //Load the required drivers
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //Try to create a connection with your database
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "Root@123");
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM employee");) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
                System.out.println("Id: " + resultSet.getInt(1) + " Name: " + resultSet.getString(2) + " Age: " + resultSet.getInt(3) + " Gender: " + resultSet.getString(4));

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
