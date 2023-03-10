package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {
    private final int userId;
    private final int id;
    private final String title;
    private final String body;

    public Post(
            @JsonProperty("userId") int userId,
            @JsonProperty("id") int id,
            @JsonProperty("title") String title,
            @JsonProperty("body") String  body
    ) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getUserId() {
        return userId;
    }

    public String toString() {
        return "post : \n" +
                "userid: " + this.userId + "\n" +
                "id: " + this.id + "\n" +
                "title: " + this.title + "\n" +
                "body" + this.body;
    }
}
