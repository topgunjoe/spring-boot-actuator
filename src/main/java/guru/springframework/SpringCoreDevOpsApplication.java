package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringCoreDevOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDevOpsApplication.class, args);
	}
}
