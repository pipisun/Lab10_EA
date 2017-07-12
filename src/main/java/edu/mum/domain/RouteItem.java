package edu.mum.domain;

import java.io.Serializable;

public class RouteItem  implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String name;
    private final double price;
    private final String auctionID;

    /**
     * Constructor
     */
    public RouteItem(String name, double price, String auctionID) {
        this.name = name;
        this.price = price;
        this.auctionID = auctionID;
    }

    /**
     * Gets name.
     */
 
    public String getName() {
        return name;
    }

	public double getPrice() {
		return price;
	}

	public String getAuctionID() {
		return auctionID;
	}

}
