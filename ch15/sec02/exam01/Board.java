package ch15.sec02.exam01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class Board {
    private String subject;
    private String content;
    private String writer;
}
