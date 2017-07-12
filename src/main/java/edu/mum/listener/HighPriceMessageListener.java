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
        RouteItem bookRouteOrder = null;
		try {
			bookRouteOrder = (RouteItem) objectMessage.getObject();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("ALBIA - Message received: " );
        System.out.println("         product Name: "  + bookRouteOrder.getName());

    }
}
