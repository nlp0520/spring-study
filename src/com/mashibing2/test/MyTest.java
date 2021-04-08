package com.mashibing2.test;

import com.mashibing2.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Auther:niulipeng
 * @Date:2021/4/8
 * @Description:com.mashibing2.bean.test
 * @Version:1.0
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
