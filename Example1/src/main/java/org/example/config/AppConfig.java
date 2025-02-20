package org.example.config;

import org.example.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    Student student(){
        Student student = new Student();
        student.setName("Rafay");
        student.setAge(22);
        return student;
    }
}
