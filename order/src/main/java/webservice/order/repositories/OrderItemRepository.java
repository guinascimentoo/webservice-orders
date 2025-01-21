package webservice.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import webservice.order.entities.OrderItem;
import webservice.order.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}