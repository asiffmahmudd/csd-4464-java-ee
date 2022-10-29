package assignment3;

import lombok.*;
import lombok.extern.jackson.Jacksonized;
import org.codehaus.jackson.annotate.JsonProperty;

@Data
@ToString
@Getter
@Setter
@EqualsAndHashCode
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class BlogPost {

    private String id;
    private String authorId;
    private String postContent;

    private BlogPost(String id, String authorId, String postContent) {
        this.id = id;
        this.authorId = authorId;
        this.postContent = postContent;
    }

    @Jacksonized
    @Builder
    private static BlogPost of(@NonNull @JsonProperty("id") String id, @NonNull @JsonProperty("authorId") String authorId,@JsonProperty("postContent") String postContent){
        return new BlogPost(id, authorId, postContent);
    }
}
