package org.sanbro.Beans;

import org.sanbro.POJO.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanCreationWithConfig {

        @Bean
        public Student getStudent1(){
            System.out.println("creating bean sanbro");
            var student = new Student();
            student.setId(1);
            student.setName("sanbro");
            return student;
        }
    @Bean("getStudent1")
    public Student getStudent2(){
        System.out.println("creating bean sanketh");
        var student = new Student();
        student.setId(1);
        student.setName("sanketh");
        return student;
    }
}
