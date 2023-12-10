package com.suppenstube.model.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NewsTest {

    @Test
    public void testNewsConstructor() {
        News news = new News();
        assertNotNull(news);
    }

    @Test
    public void testNewsIdGetterSetter() {
        News news = new News();
        news.setId(1L);
        assertEquals(1L, news.getId());
    }

    @Test
    public void testNewsTitleGetterSetter() {
        News news = new News();
        news.setHeadline("Test Title");
        assertEquals("Test Title", news.getHeadline());
    }

    @Test
    public void testNewsContentGetterSetter() {
        News news = new News();
        news.setText("Test Content");
        assertEquals("Test Content", news.getText());
    }

}