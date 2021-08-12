package config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ProjetoArquiteturamicrosservicosConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoArquiteturamicrosservicosConfigserverApplication.class, args);
	}

}
