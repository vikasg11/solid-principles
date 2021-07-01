package com.vg.principles.solid.singlereponsibility.bydefinition;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Publisher {

    public void publishArticle(Publishable publishable) {
        log.info(publishable.getArticleContent());
    }
}
