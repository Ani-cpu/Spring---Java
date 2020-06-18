package pack1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve a bean from the spring container
		
		Coach theCoach = context.getBean("MyCoach",Coach.class);
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		
		context.close();
		
		
	}

}
