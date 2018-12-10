package spark.invoker.config.ribbon;

import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @ClassName ProviderConfig
 * @Description TODO
 * @Author Spark
 * @Date 12/10/2018 2:47 PM
 * @Version 1.0
 **/
@RibbonClient(name = "provider", configuration = MyConfig.class)
public class ProviderConfig {
}
