package com.lpu;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lpu.model.Student;
import com.lpu.sevice.StudentService;
@SpringBootApplication
public class SpringBootProjectApplication implements CommandLineRunner {

    @Autowired
    StudentService service;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProjectApplication.class, args);
    }

    public void run(String... args) {

//        service.saveStudent(new Student(2,"VikasReddy","vikasreddy@gmail.com"));
        
//        System.out.println("*******************************");
//        System.out.println( "count of students = " + service.countStudents());
//        System.out.println("*******************************");
//        
//        service.deleteStudent(1);
//        Iterable<Student> std1 =  service.getAllStudents();
//        System.out.println("*******************************");
//        for(Student s : std1) {
//        	System.out.println(s);
//        }
//        System.out.println("*******************************");
//        
//        
        List<Student> list = List.of(
                new Student(1,"Ravi","ravi@gmail.com"),
                new Student(3,"Rahul","rahul@gmail.com"),
                new Student(4,"Anil","anil@gmail.com")
        );
        System.out.println("*******************************");
        service.saveAllStudent(list);
//
//        System.out.println("All students saved");
//        System.out.println("*******************************");
//        
        Iterable<Student> std =  service.getAllStudents();
        System.out.println("*******************************");
        for(Student s : std) {
        	System.out.println(s);
        }
        
//        List<Integer> ids = List.of(2,3,4);
//        Iterable<Student> findStdsByid = service.findStudentAllById(ids);
//        
//        
//        for(Student s : findStdsByid) {
//        	System.out.println(s);
//        }
        
//         service.deleteStudentsByIds(ids);
//         service.deleteAllStudents();
        
        
    }
}