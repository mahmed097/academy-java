package com.bptn.course._08_opp_demo;

class ShoppingCart {

	private CartItem[] items;
	private int itemCount;

	public ShoppingCart() {
		items = new CartItem[5];
		itemCount = 0;
	}

	// addProductCart

	public void addProductToCart(Product product, int quantity) {
		if (itemCount <= 4) {
			CartItem newItem = new CartItem(product, quantity);
			items[itemCount] = newItem;
			itemCount++;
			product.reduceStockProduct(quantity);
		} else {
			throw new IllegalArgumentException("Cart Full");
		}
	}

	// showProductsInCart
	public CartItem[] showProductsInCart() {
		CartItem[] currentItems = new CartItem[itemCount];
		for (int i = 0; i < itemCount; i++) {
			currentItems[i] = items[i];
		}
		return currentItems;
	}
}
