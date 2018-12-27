package spark.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import spark.provider.service.MessageService;

@SpringBootApplication
@EnableEurekaClient
@EnableBinding(MessageService.class)
public class Provider1Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider1Application.class, args);
    }

    @StreamListener("inputStream")
    public void receive(byte[] msg) {
        System.out.println("Provider1 receives a message:" + new String(msg));
    }
}
