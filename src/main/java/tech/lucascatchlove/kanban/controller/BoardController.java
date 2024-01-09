package tech.lucascatchlove.kanban.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.lucascatchlove.kanban.model.Board;
import tech.lucascatchlove.kanban.repository.BoardRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/boards")
public class BoardController {

    private final BoardRepository boardRepository;

    @Autowired
    public BoardController(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @GetMapping
    public List<Board> getAllBoards() {
        return boardRepository.findAll();
    }

    @GetMapping("/{id}")
    public Board getBoardById(@PathVariable Integer id) {
        Optional<Board> optionalBoard = boardRepository.findById(id);
        return optionalBoard.orElse(null);
    }

    @PostMapping
    public Board createBoard(@RequestBody Board board) {
        return boardRepository.save(board);
    }

    @PutMapping("/{id}")
    public Board updateBoard(@PathVariable Integer id, @RequestBody Board updatedBoard) {
        Optional<Board> optionalBoard = boardRepository.findById(id);
        if (optionalBoard.isPresent()) {
            Board existingBoard = optionalBoard.get();
            existingBoard.setName(updatedBoard.getName());
            return boardRepository.save(existingBoard);
        } else {
            return null; // Board not found
        }
    }

    @DeleteMapping("/{id}")
    public void deleteBoard(@PathVariable Integer id) {
        boardRepository.deleteById(id);
    }
}
