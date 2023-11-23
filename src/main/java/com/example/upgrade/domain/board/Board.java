package com.example.upgrade.domain.board;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Getter;

@Entity
@Getter
public class Board {

    @Id
    @Column(name = "board_Id")
    Long boardId;

    @Lob
    @Column(name = "board_content")
    String content;
}
