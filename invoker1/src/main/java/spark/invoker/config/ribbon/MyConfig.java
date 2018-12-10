package spark.invoker.config.ribbon;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName MyConfig
 * @Description TODO
 * @Author Spark
 * @Date 12/10/2018 1:30 PM
 * @Version 1.0
 **/
public class MyConfig {
    @Bean
    public IRule getRule() {
        return new MyRule();
    }

    @Bean
    public IPing getPing() {
        return new MyPing();
    }
}
