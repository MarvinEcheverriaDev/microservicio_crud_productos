package inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"controller","service"})
public class MicroservicioCrudProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioCrudProductosApplication.class, args);
	}

}
