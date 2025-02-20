/**
 * This is the main entry point of the application.
 *
 * @author Rafay
 * @version 22
 */
package org.example;

import org.example.bean.Student;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * This class demonstrates the difference between managing objects with and without the Spring IOC container.
 */
public class Main {

    /**
     * The main method is called when the application starts.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        /**
         * Managing Student detail without Spring IOC container (bean)
         *
         * In this section, we manually create a Student object and set its properties.
         * This approach is tedious and not recommended as it has to be repeated for every object.
         */
        Student student1 = new Student();
        student1.setName("Maroof");
        student1.setAge(24);

        System.out.println("Student 1 details without bean: \nName:" + student1.getName() + "\nAge:" + student1.getAge());

        /**
         * Managing Student details using Spring IOC container (beans)
         *
         * In this section, we use the Spring IOC container to create and manage a Student object.
         * We create an instance of AnnotationConfigApplicationContext and pass the AppConfig class to it.
         * Then, we retrieve a Student bean from the context and print its details.
         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student2 = context.getBean(Student.class);
        System.out.println("Student 2 details with bean: \nName:" + student2.getName() + "\nAge:" + student2.getAge());
    }
}