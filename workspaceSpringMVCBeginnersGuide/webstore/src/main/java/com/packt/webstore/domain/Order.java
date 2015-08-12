package com.packt.webstore.domain;

import java.io.Serializable;

public class Order  implements Serializable{

  private static final long serialVersionUID = -3560539622417210365L;
  
  private Long orderId;
  private Cart cart;
  private Customer customer;
  private ShippingDetail shippingDetail;
  
  public Order() {
    this.customer = new Customer();
    this.shippingDetail = new ShippingDetail();
  }

public Long getOrderId() {
	return orderId;
}

public void setOrderId(Long orderId) {
	this.orderId = orderId;
}

public Cart getCart() {
	return cart;
}

public void setCart(Cart cart) {
	this.cart = cart;
}

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

public ShippingDetail getShippingDetail() {
	return shippingDetail;
}

public void setShippingDetail(ShippingDetail shippingDetail) {
	this.shippingDetail = shippingDetail;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((cart == null) ? 0 : cart.hashCode());
	result = prime * result + ((customer == null) ? 0 : customer.hashCode());
	result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
	result = prime * result
			+ ((shippingDetail == null) ? 0 : shippingDetail.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Order other = (Order) obj;
	if (cart == null) {
		if (other.cart != null)
			return false;
	} else if (!cart.equals(other.cart))
		return false;
	if (customer == null) {
		if (other.customer != null)
			return false;
	} else if (!customer.equals(other.customer))
		return false;
	if (orderId == null) {
		if (other.orderId != null)
			return false;
	} else if (!orderId.equals(other.orderId))
		return false;
	if (shippingDetail == null) {
		if (other.shippingDetail != null)
			return false;
	} else if (!shippingDetail.equals(other.shippingDetail))
		return false;
	return true;
}

  // add getters and setters for all the fields here.
  // Override equals and hashCode based on orderId field.
     // the code for the same is available in the code bundle which can be downloaded from www.packtpub.com/support
}
