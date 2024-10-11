package webservice.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import webservice.order.entities.Category;
import webservice.order.entities.User;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}