
package edu.mum.integration;

import edu.mum.domain.Item;
import edu.mum.domain.RouteItem;

/**
 * Routes order based on order type.
 *
 */

public interface ItemTransformer {

	public RouteItem transformItem(Item item);

}
