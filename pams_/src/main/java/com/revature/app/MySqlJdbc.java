package com.revature.app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlJdbc {

    public static void main(String[] args) {

       
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/pams_project", "root", "2798")) {

            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}