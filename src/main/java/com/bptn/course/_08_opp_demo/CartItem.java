package com.bptn.course._08_opp_demo;

class CartItem {

	private Product product;
	private int carQuantity;

	public CartItem(Product product, int quantity) {
		this.carQuantity = quantity;
		this.product = product;
		if (quantity > product.getProductQuantity()) {
			throw new IllegalArgumentException("Insuffient Stock!");
		}
	}

	// Getter
	public Product getProduct() {
		return this.product;
	}

	public int getCarQuantity() {
		return this.carQuantity;
	}

	public double getTotalPrice() {
		return product.getProductPrice() * this.carQuantity;
	}
}
