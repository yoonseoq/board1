package com.green.board1;

import com.green.board1.model.BoardInsReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    int insBoard(BoardInsReq q);
// 이 메소드는 게시물을 데이터베이스에 삽입하는 역할을 한다
}