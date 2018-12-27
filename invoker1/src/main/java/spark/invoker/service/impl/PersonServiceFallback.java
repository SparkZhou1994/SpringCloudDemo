package spark.invoker.service.impl;

import org.springframework.stereotype.Component;
import spark.invoker.entity.Person;
import spark.invoker.service.PersonService;

/**
 * @ClassName PersonServiceFallback
 * @Description TODO
 * @Author Spark
 * @Date 12/18/2018 12:34 PM
 * @Version 1.0
 **/
@Component
public class PersonServiceFallback implements PersonService {
    @Override
    public Person getPerson(Integer personId) {
        return null;
    }

    @Override
    public String timeout() {
        System.out.println("timeout,fallback");
        return null;
    }
}
