package org.example.dto.post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.example.dto.common.ResponseListDto;

import java.util.List;

@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResponsePostListDto extends ResponseListDto {

    private List<ResponsePostDto> postList;
}
