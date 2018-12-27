package spark.invoker.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

/**
 * @ClassName MessageService
 * @Description TODO
 * @Author Spark
 * @Date 12/27/2018 3:38 PM
 * @Version 1.0
 **/
public interface MessageService {
    @Output("inputStream")
    SubscribableChannel sendMessage();
}
