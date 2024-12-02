package edu.me.crm.service;

import edu.me.crm.model.Student;

public class StudentService {
    public Student getStudent(){
        Student std =  new Student();
        std.setName("kamal");
        return std;
    }
}
