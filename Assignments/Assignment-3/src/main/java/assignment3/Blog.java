package assignment3;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Blog {

    List<BlogPost> posts = new ArrayList<>();
    List<Person> contributors = new ArrayList<>();

    public List<String> getPostsByAuthorAge(Integer age){
        List<String> personIdList =  contributors.stream().filter(i->i.getAge()==age).
                map(i->i.getId()).collect(Collectors.toList());
        return posts.stream().filter(i->personIdList.contains(i.getAuthorId())).map(i->i.getId()).collect(Collectors.toList());
    }
}
