package tech.lucascatchlove.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.lucascatchlove.kanban.model.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
