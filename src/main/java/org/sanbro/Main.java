package org.sanbro;

import org.sanbro.Beans.BeanCreationWithConfig;
import org.sanbro.POJO.Student;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanCreationWithConfig.class);
        var beans = applicationContext.getBeanDefinitionNames();
        for(String str:beans){
            System.out.println(str);
        }
       // Student student = applicationContext.getBean(Student.class);
      var student1 = applicationContext.getBean("getStudent1");
        System.out.println(student1);
    }
}