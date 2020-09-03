package com.reckue.terms.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "terms")
public class Term {

    @Id
    private String id;
    private String collectionId;
    private String userId;
    private String word;
    private List<Translation> translations;
    private List<Definition> definitions;
}
