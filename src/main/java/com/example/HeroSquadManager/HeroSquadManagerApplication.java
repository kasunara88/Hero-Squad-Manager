package com.example.HeroSquadManager;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HeroSquadManagerApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("heroes.xml");

		Hero superman = context.getBean("superman", Hero.class);
		Hero wonderWoman1 = context.getBean("wonderWoman", Hero.class);
		Hero talkingCat = context.getBean("talkingCat", Hero.class);

		superman.action();
		wonderWoman1.action();
		talkingCat.action();

		Hero wonderWoman2 = context.getBean("wonderWoman", Hero.class);
		System.out.println("Are Wonder Woman instances the same? " + (wonderWoman1 == wonderWoman2));
	}

}
