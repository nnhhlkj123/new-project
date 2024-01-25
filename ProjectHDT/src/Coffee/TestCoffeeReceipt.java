package Coffee;

import junit.framework.TestCase;

public class TestCoffeeReceipt extends TestCase {
	public void testConstructor() {
		new CoffeeReceipt("Hawaiian Kona", 15.95, 100);
		new CoffeeReceipt("Ethiopian", 8.00, 1000);
		new CoffeeReceipt("Colombian Supreme ", 9.50, 1700);
	}

	public void testSellingCost() {
		CoffeeReceipt hk = new CoffeeReceipt("Hawaiian Kona", 15.95, 100);
		assertEquals(hk.sellingCost(), 1595.00, 0.001);

		CoffeeReceipt e = new CoffeeReceipt("Ethiopian", 8.00, 1000);
		assertEquals(e.sellingCost(), 8000.00, 0.001);

		CoffeeReceipt cs = new CoffeeReceipt("Colombian Supreme ", 9.50, 1700);
		assertEquals(cs.sellingCost(), 16150.00, 0.001);
	}
}

