package com.green.board1;

import com.green.board1.model.BoardInsReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

/*
    이 클래스는 boardmapper 인터페이스를 사용하여
 */
public class BoardService {
    private final BoardMapper mapper;
    // 이 멤버필드로 데이터베이스 작업을 수행한다.

    public int insBoard(BoardInsReq q){
        // 이 메소드는 게시물을 데이터베이스에 삽입하는 기능을 수행
        return mapper.insBoard(q);
    }
}
