package in.onesoft.products.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.onesoft.products.entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Integer> {
}
