package org.example.dto.post;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestRegisterPostDto {

    @NotBlank(message = "제목을 입력해주세요.")
    private String title;

    private String content;

    public boolean isValidate() {
        return !title.contains("비속어");
    }
}
