package webservice.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import webservice.order.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}