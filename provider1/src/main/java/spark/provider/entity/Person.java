package spark.provider.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Person
 * @Description TODO
 * @Author Spark
 * @Date 11/28/2018 11:21 AM
 * @Version 1.0
 **/
@Data
public class Person {
    private Integer id;
    private String name;
    private Integer age;

    public Person() {}
    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}