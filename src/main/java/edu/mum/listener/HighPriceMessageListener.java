package edu.mum.listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.mum.domain.RouteItem;


public class HighPriceMessageListener implements MessageListener {
    private static final Logger logger = LoggerFactory.getLogger(HighPriceMessageListener.class);

    public void onMessage(Message message) {
        ObjectMessage objectMessage = (ObjectMessage) message;
        RouteItem bookRouteItem = null;
		try {
			bookRouteItem = (RouteItem) objectMessage.getObject();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("High Price - Message received: ");
		System.out.println("         Item Name: " + bookRouteItem.getName());
		System.out.println("         Price: " + bookRouteItem.getPrice());
		System.out.println("         Auction Name: " + bookRouteItem.getAuctionID());
    }
}
