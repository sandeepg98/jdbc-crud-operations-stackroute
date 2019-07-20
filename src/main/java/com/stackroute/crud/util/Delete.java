package com.stackroute.crud.util;

import java.sql.*;

public class Delete {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public void deleteOperation(int id){

        //Load the required drivers
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //Try to create a connection with your database
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "Root@123");
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM employee WHERE id='"+id+"'");) {

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println(rowsAffected + " rows deleted");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
