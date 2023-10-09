package org.example.dto.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.example.common.utils.PagingUtil;

@Getter
@SuperBuilder
@NoArgsConstructor
public class ResponseListDto {

    private PagingUtil pagingUtil;
}
