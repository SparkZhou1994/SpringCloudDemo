package spark.hystrixmonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixmonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixmonitorApplication.class, args);
    }

}

