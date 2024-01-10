package tech.lucascatchlove.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.lucascatchlove.kanban.model.Board;

public interface BoardRepository extends JpaRepository<Board, Integer> {
}


