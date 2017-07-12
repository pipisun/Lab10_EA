 
package edu.mum.integration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.mum.domain.RouteItem;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Router;

/**
 * Routes order based on order type.
 * 
 */
@MessageEndpoint
public class ItemRouter {

    final Logger logger = LoggerFactory.getLogger(ItemRouter.class);
    
    /**
     * Process order.  Routes based on whether or 
     * not the order is a delivery or pickup.
     */
	@Router(inputChannel="processItem")
	public String processItem(RouteItem item) {
	    String destination = null;
	    
	    if(item.getPrice() > 20)
	    	destination = "highPriceChannel";
	    else
	    	destination = "lowPriceChannel";
	
		return destination;
	}

}
