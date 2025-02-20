package org.example;

import org.example.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Student.class);
        Student student = context.getBean(Student.class);
        student.setName("Rafay");
        student.setAge(22);

        System.out.println("Initializing the student using Component annotation: " + student.getName() + " " + student.getAge());
    }
}