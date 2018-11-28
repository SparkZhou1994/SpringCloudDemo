package spark.invoker1.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName InvokerController
 * @Description TODO
 * @Author Spark
 * @Date 11/28/2018 11:39 AM
 * @Version 1.0
 **/
@Configuration
public class InvokerController {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/router")
    public String router() {
        RestTemplate restTpl = getRestTemplate();
        String json = restTpl.getForObject("http://provider1/person/1", String.class);
        return json;
    }
}
