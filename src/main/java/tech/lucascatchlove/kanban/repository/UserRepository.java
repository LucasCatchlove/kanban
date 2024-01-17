package tech.lucascatchlove.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.lucascatchlove.kanban.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
