package edu.mum;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.mum.amqp.ItemService;
import edu.mum.amqp.ItemServiceImpl;

public class AmqpProducerMain {
	
	private final static String[] configFilesGatewayDemo = {
			"/META-INF/spring/amqp-item-app-context.xml",
			"/META-INF/spring/common.xml",
	 		"/META-INF/spring/itemGateway.xml",
			"/META-INF/spring/jms-highprice-app-context.xml",
			"/META-INF/spring/jms-lowprice-app-context.xml"
		};
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(configFilesGatewayDemo, AmqpProducerMain.class);			

		// Publish to "direct" exchange on item.key == directQueue
//		RabbitTemplate directTemplate = context.getBean("amqpTemplate", RabbitTemplate.class);
//		ItemService itemService = new ItemServiceImpl();
//		itemService.publish(directTemplate);
	}
}
