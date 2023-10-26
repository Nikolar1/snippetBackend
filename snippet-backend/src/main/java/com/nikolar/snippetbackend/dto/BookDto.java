package com.nikolar.snippetbackend.dto;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookDto {
    private long id;
    private String name;
    private List<SnippetDto> snippets;
    private boolean isForTraining;
}
