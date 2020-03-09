package controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Address;
import beans.Contact;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Contact contact() {
	Contact bean = new Contact();
	bean.setName("Dr. Seuss");
	bean.setPhone("555-555-5555");
	bean.setRelationship("friend");
	return bean;
	}
	
	@Bean
	public Address address() {
		Address bean = new Address();
		return bean;
	}

}
