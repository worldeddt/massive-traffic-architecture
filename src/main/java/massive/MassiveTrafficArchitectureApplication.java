package massive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
@EnableCassandraRepositories(basePackages = "massive.repository")
public class MassiveTrafficArchitectureApplication {

    public static void main(String[] args) {
        SpringApplication.run(MassiveTrafficArchitectureApplication.class, args);
    }

}
