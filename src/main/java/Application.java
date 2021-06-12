import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author chxy
 * @date 2021/6/12 09:51
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.meizhuliu.zl.finance")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
