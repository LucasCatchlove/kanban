package tech.lucascatchlove.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.lucascatchlove.kanban.model.TaskColumn;

public interface ColumnTaskRepository extends JpaRepository<TaskColumn, Integer> {
}
