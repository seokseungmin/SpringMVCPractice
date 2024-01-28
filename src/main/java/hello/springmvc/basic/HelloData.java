package hello.springmvc.basic;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Data
public class HelloData {
    private String username;
    private int age;
}
