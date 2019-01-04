/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.da;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author quanglinh
 */
public class DBConnection {
    private static Connection connection;
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        if (connection == null) {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/struts-db", "sa", "sa"
            );
        }
        return connection;
    }
}
