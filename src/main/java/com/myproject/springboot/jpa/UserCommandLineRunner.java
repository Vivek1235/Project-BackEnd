package com.myproject.springboot.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCommandLineRunner implements CommandLineRunner{

	@Autowired
	private UsersRepository repository;
	@Autowired
	private ProfileRepository fkf;
	private Logger log=LoggerFactory.getLogger(CommandLineRunner.class);
	public void run(String... args) throws Exception {
		
//		repository.save(new User("vivek@gmail.com","vivek"));
		for(User user:repository.findAll())
		{
			log.info(user.toString());
			
         }
		
	 
	}
	

}

