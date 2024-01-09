package tech.lucascatchlove.kanban.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class TaskColumn {

    @Id
    private Integer id;
    @ManyToOne
    @JoinColumn
    private Board board_id;
    private String name;

}
