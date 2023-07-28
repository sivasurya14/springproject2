package in.onesoft.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.onesoft.products.DTO.OrderRequest;
import in.onesoft.products.entity.Customer;
import in.onesoft.products.repositories.CustomerRepository;
import in.onesoft.products.repositories.ProductRepository;

@RestController
public class OrderController {
	@Autowired
	CustomerRepository customRepo;
	@Autowired
	ProductRepository productRepo;

	@PostMapping("/placeOrder/")
	public Customer placeOrder(@RequestBody OrderRequest orderquest) {

		return customRepo.save(orderquest.getCustomer());
	}

	@GetMapping("/findAllorders")

	public List<Customer> findAlOrders() {
		return customRepo.findAll();

	}

}