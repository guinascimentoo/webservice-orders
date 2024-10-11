package webservice.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import webservice.order.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}