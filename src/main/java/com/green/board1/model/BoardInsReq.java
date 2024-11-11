package com.green.board1.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BoardInsReq {// insert 할 목적임
    private String title;
    private String content;
    private String writer;
    // 일단 이렇게 멤버필드를 만들어주고
}
