/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.da;

import com.fpt.entity.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author quanglinh
 */
public class StudentManager {
    
    private static PreparedStatement addStudent;
    private static PreparedStatement getAllStudent;
    
    private PreparedStatement addStudentStatement() throws ClassNotFoundException, SQLException{
        if (addStudent == null) {
            Connection conn = DBConnection.getConnection();
            addStudent = conn.prepareStatement("INSERT INTO SA.student (id, rollNumber, name, className, email) VALUES (?,?,?,?,?)");
        }
        return addStudent;
    }
    
    private PreparedStatement getAllStatement() throws ClassNotFoundException, SQLException{
        if (getAllStudent == null) {
            Connection conn = DBConnection.getConnection();
            getAllStudent = conn.prepareStatement("SELECT * FROM SA.student");
        }
        return getAllStudent;
    }
    
    public int addStudent(Long id, int roll, String name, String className, String email) throws Exception{
        PreparedStatement statement = addStudentStatement();
        statement.setLong(1, id);
        statement.setInt(2, roll);
        statement.setString(3, name);
        statement.setString(4, className);
        statement.setString(5, email);
        
        List<Student> students = new LinkedList<>();
        System.out.println("addStudent(.....) ");
        students.add(new Student(id, roll, name, className, email));
        
        return statement.executeUpdate();
    }
    
    public List<Student> getAllStudent() throws ClassNotFoundException, SQLException{
        PreparedStatement statement = getAllStatement();
        ResultSet rs = statement.executeQuery();
        List<Student> students = new LinkedList<>();
        
        while (rs.next()) {            
            System.out.println("getAllStudent");
            long id = rs.getLong("id");
            int roll = rs.getInt("rollNumber");
            String name = rs.getString("name");
            String className = rs.getString("className");
            String email = rs.getString("email");
            students.add(new Student(id, roll, name, className, email));
        }
        return students;
    }
    
    
    
}
