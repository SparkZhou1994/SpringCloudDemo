package spark.invoker.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spark.invoker.entity.Person;

/**
 * @ClassName PersonService
 * @Description TODO
 * @Author Spark
 * @Date 12/12/2018 3:17 PM
 * @Version 1.0
 **/
@FeignClient("provider")
public interface PersonService {
    @RequestMapping(method = RequestMethod.GET,value = "/person/{personId}")
    Person getPerson(@PathVariable("personId") Integer personId);

}
