package mangolost.dubboserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 */
@SpringBootApplication
public class DubboProviderApplication {

    public static void main(String[] args) {
        System.out.println("aaaaa");
        SpringApplication.run(DubboProviderApplication.class, args);
        System.out.println("bbbbb");
    }

}
