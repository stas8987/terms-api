package com.reckue.terms.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Document(collection = "terms")
public class Term {

    @Id
    private String id;
    private String userId;
    private String collectionId;
    private String name;
    private List<String> translationsId;
    private List<String> definitionsId;
    private LevelTypes level;
}
