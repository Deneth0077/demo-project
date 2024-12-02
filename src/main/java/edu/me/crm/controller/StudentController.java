package edu.me.crm.controller;

import edu.me.crm.model.Student;
import edu.me.crm.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/get-customer")
    public Student getStudent(){
        StudentService service = new StudentService();
        Student student = service.getStudent();
        System.out.println(student);
        return student;
    }
}
