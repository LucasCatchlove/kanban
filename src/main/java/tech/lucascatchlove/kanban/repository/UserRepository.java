package tech.lucascatchlove.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.lucascatchlove.kanban.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
}
