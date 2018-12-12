package spark.invoker.entity;

import lombok.Data;

/**
 * @ClassName Person
 * @Description TODO
 * @Author Spark
 * @Date 12/12/2018 3:29 PM
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
