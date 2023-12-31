package org.example.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.dto.post.RequestUpdatePostDto;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    @Column(length = 200)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    @CreatedDate
    private LocalDateTime createdDate;

    @Builder
    public Post(String title, String content, LocalDateTime createdDate) {
        this.title = title;
        this.content = content;
        this.createdDate = createdDate;
    }

    public void update(RequestUpdatePostDto requestDto) {
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
    }
}