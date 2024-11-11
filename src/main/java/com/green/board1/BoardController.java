package com.green.board1;

import com.green.board1.model.BoardInsReq;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    /*
        @애노테이션을  붙이면 아래 생성자가 자동으로 만들어진다
        public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }*/
    @PostMapping
    public int insBoard(@RequestBody BoardInsReq q){
        System.out.println(q);
        return boardService.insBoard(q);
    }


}
