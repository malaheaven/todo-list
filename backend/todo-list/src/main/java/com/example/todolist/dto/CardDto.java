package com.example.todolist.dto;


import com.example.todolist.domain.User;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;


public class CardDto {
    public static final String DATETIME_FORMAT = "yyyy-MM-dd HH:mm";

    private User user;

    private String title;

    private String contents;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATETIME_FORMAT, timezone = "Asia/Seoul")
    private LocalDateTime postTime;

    public CardDto(User user, String title, String contents, LocalDateTime postTime) {
        this.user = user;
        this.title = title;
        this.contents = contents;
        this.postTime = postTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public LocalDateTime getPostTime() {
        return postTime;
    }

    @Override
    public String toString() {
        return "CardDto{" +
                "user=" + user +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                ", postTime=" + postTime +
                '}';
    }
}