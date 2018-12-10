package spark.invoker.config.ribbon;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.Server;

/**
 * @ClassName MyPing
 * @Description TODO
 * @Author Spark
 * @Date 12/10/2018 11:33 AM
 * @Version 1.0
 **/
public class MyPing implements IPing {
    @Override
    public boolean isAlive(Server server) {
        System.out.println("Ping,following is the servers'info" + server.getHostPort());
        return true;
    }
}
