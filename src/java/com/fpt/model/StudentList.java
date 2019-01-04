/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.model;

import com.fpt.da.StudentManager;
import com.fpt.entity.Student;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 * com.shop.model.ProductList
 * @author quanglinh
 */
public class StudentList extends ActionSupport{
    private List<Student> students;

    public List<Student> getProducts() {
        return students;
    }

    public void setProducts(List<Student> students) {
        this.students = students;
    }

    public StudentList() {
    }

    @Override
    public String execute() throws Exception {
        students = new StudentManager().getAllStudent();
        return SUCCESS;
    }
    
    
}
