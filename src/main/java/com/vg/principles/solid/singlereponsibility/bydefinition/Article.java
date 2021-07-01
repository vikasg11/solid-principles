package com.vg.principles.solid.singlereponsibility.bydefinition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.StringJoiner;

@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article implements Publishable {

    private String topic;
    private String author;
    private String content;

    @Override
    public String getArticleContent() {
        return new StringJoiner(topic).add(content).add(author).toString();
    }
}
