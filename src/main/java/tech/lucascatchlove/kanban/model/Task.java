package tech.lucascatchlove.kanban.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class Task {
    @Id
    private Integer id;
    @ManyToOne
    @JoinColumn
    private Board board_id;
    @ManyToOne
    @JoinColumn
    private TaskColumn column_id;
    private String title;
    private String description;
    private LocalDate start_date;
    private LocalDate end_date;
    private Integer assignee_id;

}
