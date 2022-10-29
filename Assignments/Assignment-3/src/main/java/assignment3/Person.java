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
public class Person {
	private String id;
    private String firstName;
	private String lastName;
    private Integer age;
    private String gender;

    private Person(String id, String firstName, String lastName, Integer age, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    @Jacksonized
    @Builder
    private static Person of(@NonNull @JsonProperty("id") String id, @NonNull @JsonProperty("firstName") String firstName, @NonNull @JsonProperty("lastName") String lastName, @JsonProperty("age") Integer age, @JsonProperty("gender")   String gender){

        if("".equals(firstName)){
            throw new RuntimeException("First name can not be empty");
        }
        if("".equals(lastName)){
            throw new RuntimeException("Last name can not be empty");
        }
        if(age<0){
            throw new RuntimeException("Age has to be greater than zero");
        }
        return new Person(id, firstName, lastName, age, gender);
    }
    
    
    
}