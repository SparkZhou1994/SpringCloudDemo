package spark.gateway.config.hystrix;

import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName FallbackConfig
 * @Description TODO
 * @Author Spark
 * @Date 12/25/2018 9:16 AM
 * @Version 1.0
 **/
@Configuration
public class FallbackConfig {

    @Bean
    public ZuulFallbackProvider personFallbackProvider(){
        return new MyFallbackProvider();
    }
}
