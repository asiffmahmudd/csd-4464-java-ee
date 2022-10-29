package assignment3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import assignment3.Blog;
import assignment3.BlogPost;
import assignment3.Person;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TheBlogTest {



    @Test
    void BlogPostValidTest() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Person> personList = new ArrayList<Person>();
        personList = mapper.readValue(new File("persons.json"),
                new TypeReference<List<Person>>(){});

        List<BlogPost> blogList = new ArrayList<>();
        blogList = mapper.readValue(new File("blogPosts.json"),
                new TypeReference<List<BlogPost>>(){});


        Blog blog = new Blog();
        blog.setPosts(blogList);
        blog.setContributors(personList);
        List<String> actualBlogId = blog.getPostsByAuthorAge(22);
        List<String> expectedBlogId = Arrays.asList("124","123");
        assertEquals(expectedBlogId.size(),actualBlogId.size());
        assertTrue(expectedBlogId.containsAll(actualBlogId));
        assertTrue(actualBlogId.containsAll(expectedBlogId));

    }

}