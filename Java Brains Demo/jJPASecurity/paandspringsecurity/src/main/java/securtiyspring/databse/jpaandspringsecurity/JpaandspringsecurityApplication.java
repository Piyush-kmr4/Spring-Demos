package securtiyspring.databse.jpaandspringsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "models")
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class JpaandspringsecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaandspringsecurityApplication.class, args);
    }

}
