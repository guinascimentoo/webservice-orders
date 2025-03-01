package webservice.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import webservice.order.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}