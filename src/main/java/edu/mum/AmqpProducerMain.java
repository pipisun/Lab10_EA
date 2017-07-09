package edu.mum;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import edu.mum.amqp.ItemService;
import edu.mum.amqp.ItemServiceImpl;

public class AmqpProducerMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new GenericXmlApplicationContext(
				"classpath:META-INF/spring/item-app-context.xml");

		// Publish to "direct" exchange on item.key == directQueue
		RabbitTemplate directTemplate = context.getBean("directTemplate", RabbitTemplate.class);
		ItemService itemService = new ItemServiceImpl();
		itemService.publish(directTemplate);
	}
}
