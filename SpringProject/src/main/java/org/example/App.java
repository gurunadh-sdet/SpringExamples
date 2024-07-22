package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Developer developer1 =  context.getBean(Developer.class);
        //developer1.setAge(25);
        developer1.code();
        System.out.println(developer1.getAge());
        //Desktop desktop =context.getBean("desktop",Desktop.class);
        //Desktop desktop = (Desktop) context.getBean("com1");
//        Desktop desktop1 =context.getBean("desktop",Desktop.class);
//        desktop1.compile();
//        Desktop desktop2 =context.getBean("desktop",Desktop.class);//only object created because by default singleton
//        desktop2.compile();

        /*
        //System.out.println( "Hello World!" );
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //Developer developer = new Developer();
        //developer.code();
        Developer developer1 = (Developer) applicationContext.getBean("developer1");
        //developer1.age=21;
        developer1.code();
        System.out.println(developer1.getAge());

       // Developer developer2 = (Developer) applicationContext.getBean("developer1");
        //developer2.code();
      //  System.out.println(developer2.age);

*/


    }
}
