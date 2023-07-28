package in.onesoft.products.DTO;

import in.onesoft.products.entity.Customer;

public class OrderRequest {

	private Customer customer;
	public OrderRequest(Customer customer) {
		super();
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


}
