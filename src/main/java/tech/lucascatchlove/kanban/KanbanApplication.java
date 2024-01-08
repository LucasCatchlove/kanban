package tech.lucascatchlove.kanban;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KanbanApplication {

	public static void main(String[] args) {
		System.out.print("hello word!");
		SpringApplication.run(KanbanApplication.class, args);
	}

}
