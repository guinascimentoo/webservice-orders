package webservice.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import webservice.order.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}