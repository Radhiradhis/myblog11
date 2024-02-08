package com.myblog.com.myblog11.payload;

import lombok.Data;

@Data
public class CommentDto {
    private long id;

    private String text;

    private String email;

}
