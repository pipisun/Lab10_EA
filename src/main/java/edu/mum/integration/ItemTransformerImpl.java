
package edu.mum.integration;

import org.springframework.integration.annotation.Transformer;

import edu.mum.domain.Item;
import edu.mum.domain.RouteItem;

/**
 * Routes order based on order type.
 *
 */
public class ItemTransformerImpl implements ItemTransformer {

	/**
	 * Transform Order from AMQP to RouteOrder for JMS
	 */
	@Transformer(inputChannel="fromR", outputChannel="fromTransformer")
	public RouteItem transformItem(Item item) {
 
		String name = item.getName();
		double price = item.getPrice();
		String auctionID = name + item.getVersion();
	    
		RouteItem bookItem = new RouteItem(name, price, auctionID);
	    	 	
		return bookItem;
	}
}
