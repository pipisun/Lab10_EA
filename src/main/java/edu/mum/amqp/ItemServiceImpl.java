package edu.mum.amqp;

import org.springframework.amqp.rabbit.core.RabbitTemplate;

import edu.mum.domain.Item;

public class ItemServiceImpl implements ItemService {
	public void publish(RabbitTemplate rabbitTemplate) {

		/***************
		 * SEND ORDER TO purchases.store
		 ******************************/
		Item item1 = new Item("Kazoo", "Kazoo Decription");
		rabbitTemplate.convertAndSend(item1);
		
		Item item2 = new Item("Hammer", "Hammer Decription");
		rabbitTemplate.convertAndSend(item2);
	}

}
