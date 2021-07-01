package com.vg.principles.solid.singlereponsibility.raw;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    private String topic;
    private String author;
    private String content;

    public void publishArticle() {
        log.info(content);
    }

}
