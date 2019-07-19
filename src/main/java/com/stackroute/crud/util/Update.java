package com.stackroute.crud.util;

import java.sql.*;

public class Update {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public void updateOperation(int id, String name, int age, String gender){

        //Load the required drivers
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //Try to create a connection with your database
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "Root@123");
             PreparedStatement preparedStatement = connection.prepareStatement("UPDATE employee SET name=?, age=?, gender=? WHERE id=?");) {

            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setString(3, gender);
            preparedStatement.setInt(4, id);

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println(rowsAffected + " rows inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
