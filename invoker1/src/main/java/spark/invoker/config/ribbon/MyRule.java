package spark.invoker.config.ribbon;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * @ClassName MyRule
 * @Description TODO
 * @Author Spark
 * @Date 12/10/2018 10:47 AM
 * @Version 1.0
 **/
public class MyRule implements IRule {
    private ILoadBalancer loadBalancer;
    @Override
    public Server choose(Object o) {
        List<Server> servers = loadBalancer.getAllServers();
        System.out.println("Rule,following is the servers'info");
        for (Server server : servers) {
            System.out.println("   " + server.getHostPort());
        }
        return servers.get(0);
    }

    @Override
    public void setLoadBalancer(ILoadBalancer loadBalancer) {
        this.loadBalancer = loadBalancer;
    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        return this.loadBalancer;
    }
}
