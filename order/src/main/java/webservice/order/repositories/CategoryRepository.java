package webservice.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import webservice.order.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}