/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.model;

import com.fpt.da.StudentManager;
import com.fpt.entity.Student;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import java.util.List;

/**
 * com.shop.model.ProductList
 * @author quanglinh
 */
public class AddStudent extends ActionSupport{
    private int roll;
    private String name;
    private String className;
    private String email;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static Logger getLOG() {
        return LOG;
    }

    public static void setLOG(Logger LOG) {
        ActionSupport.LOG = LOG;
    }
    
    public AddStudent() {
    }

    @Override
    public String execute() throws Exception {
        long id = System.currentTimeMillis();
        new StudentManager().addStudent(id, roll, name, className, email);
        return SUCCESS;
    }
    
    
}
