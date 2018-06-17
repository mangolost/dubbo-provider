package mangolost.api;

import com.alibaba.dubbo.config.annotation.Service;

/**
 *
 */
@Service(
    version = "1.0.0",
    application = "${dubbo.application.id}",
    protocol = "${dubbo.protocol.id}",
    registry = "${dubbo.registry.id}",
        timeout = 9999
)
public class DefaultDemoService implements DemoService {

    /**
     *
     * @param name
     * @return
     */
    public String sayHello(String name) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis());
        return "Hello, " + name;

    }

}
