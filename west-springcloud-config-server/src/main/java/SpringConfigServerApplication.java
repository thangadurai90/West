import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
@EnableConfigServer
@SpringBootApplication
public class SpringConfigServerApplication {
  public static void main(String[] args)
  {
      SpringApplication.run(SpringConfigServerApplication.class, args);
  }
}
