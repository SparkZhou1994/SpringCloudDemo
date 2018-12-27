package spark.provider.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @ClassName MessageService
 * @Description TODO
 * @Author Spark
 * @Date 12/27/2018 4:03 PM
 * @Version 1.0
 **/
public interface MessageService {
    @Input("inputStream")
    SubscribableChannel receiveMessage();
}
