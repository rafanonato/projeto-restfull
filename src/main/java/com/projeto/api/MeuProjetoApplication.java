package com.projeto.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MeuProjetoApplication {

	@Value("${paginacao.qtda_por_pag}")
	private int qtdaPage;

	public static void main(String[] args) {
		SpringApplication.run(MeuProjetoApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println(this.qtdaPage);
		};
	}
}
