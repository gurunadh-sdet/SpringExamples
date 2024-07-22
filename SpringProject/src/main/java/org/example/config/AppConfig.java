package org.example.config;

import org.example.Computer;
import org.example.Desktop;
import org.example.Developer;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {


//    @Bean
//    public Developer developer(@Qualifier("desktop") Computer com){  // @Autowired is optional in latest Java
//        Developer obj =new Developer();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj ;
//    }
//
//
//   // @Bean(name={"com1", "desktop1", "beast"})
//    @Bean
//    @Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }


}
