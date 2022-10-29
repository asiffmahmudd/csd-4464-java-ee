package assignment3;

import org.junit.jupiter.api.Test;

import assignment3.BlogPost;

import static org.junit.jupiter.api.Assertions.*;

class BlogPostTest {

    @Test
    void BlogPostNullTest() {
        Exception exception = assertThrows(
        		RuntimeException.class, ()->{
                    BlogPost.builder().id(null).
                            authorId("1").
                            postContent("LastName")
                            .build();
                });
        String expected = "id is marked non-null but is null";
        String actual = exception.getMessage();
        assertTrue(actual.contains(expected));
    }

    @Test
    void BlogPostAuthorIDTestTest() {
        Exception exception = assertThrows(
        		RuntimeException.class, ()->{
                    BlogPost.builder().id("1.1").
                            authorId(null).
                            postContent("About Health")
                            .build();
                });
        String expected = "authorId is marked non-null but is null";
        String actual = exception.getMessage();
        assertTrue(actual.contains(expected));
    }

    @Test
    void BlogPostValidTest() {
        BlogPost blogPost = BlogPost.builder().id("1.1").
                authorId("1").
                postContent("About Health")
                .build();

        assertEquals(blogPost.getId(),"1.1");
        assertEquals(blogPost.getAuthorId(),"1");
        assertEquals(blogPost.getPostContent(),"About Health");

    }

}