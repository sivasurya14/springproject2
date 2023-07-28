package in.onesoft.products.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.onesoft.products.entity.Product;

public interface ProductRepository  extends JpaRepository<Product, Integer>{

}
