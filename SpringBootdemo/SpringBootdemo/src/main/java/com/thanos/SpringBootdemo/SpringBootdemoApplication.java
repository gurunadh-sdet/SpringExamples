package com.thanos.SpringBootdemo;

import com.thanos.SpringBootdemo.model.Laptop;
import com.thanos.SpringBootdemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootdemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringBootdemoApplication.class, args);
		LaptopService service = applicationContext.getBean(LaptopService.class);


		Laptop lap = applicationContext.getBean(Laptop.class);

		service.addLaptop(lap);






//		//Developer developer	= new Developer();
//		//developer.code();
//
//		Developer dev1 = applicationContext.getBean(Developer.class);
//		dev1.code();
//		System.out.println(dev1.getAge());
//




	}

}
