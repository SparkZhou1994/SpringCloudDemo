package spark.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spark.provider.entity.Person;

/**
 * @ClassName FirstController
 * @Description TODO
 * @Author Spark
 * @Date 11/28/2018 1:09 PM
 * @Version 1.0
 **/
@RestController
public class FirstController {
    @GetMapping("/person/{personId}")
    public Person findPerson(@PathVariable("personId") Integer personId){
        Person person = new Person(personId,"Spark",25);
        return person;
    }
}
