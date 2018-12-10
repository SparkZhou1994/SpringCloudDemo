package spark.invoker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.awt.*;
import java.util.List;

/**
 * @ClassName InvokerController
 * @Description TODO
 * @Author Spark
 * @Date 11/28/2018 11:39 AM
 * @Version 1.0
 **/
@Configuration
@RestController
public class InvokerController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/list")
    public String serviceCount() {
        List<String> names = discoveryClient.getServices();
        for(String serviceId : names) {
            List<ServiceInstance> instances = discoveryClient.getInstances(serviceId);
            System.out.println(serviceId + ":" + instances.size());
        }
        return "";
    }

    @GetMapping("/meta")
    public String getMetadate() {
        List<ServiceInstance> instances = discoveryClient.getInstances("provider");
        for(ServiceInstance ins : instances) {
            String message = ins.getMetadata().get("editor");
            System.out.println(ins.getPort() + ":" + message);
        }
        return "";
    }

    @GetMapping(value = "/router", produces = MediaType.APPLICATION_JSON_VALUE)
    public String router() {
        RestTemplate restTpl = getRestTemplate();
        String json = restTpl.getForObject("http://provider/person/1", String.class);
        return json;
    }
}
