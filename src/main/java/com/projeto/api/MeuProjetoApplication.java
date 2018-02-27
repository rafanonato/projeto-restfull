package com.projeto.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.projeto.api.utils.senhaUtilsJava;

@SpringBootApplication
public class MeuProjetoApplication {

	@Value("${paginacao.qtda_por_pag}")
	private int qtdaPage;

	public boolean senhaValida;

	public static void main(String[] args) {
		SpringApplication.run(MeuProjetoApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {

			String senhaEncoded = senhaUtilsJava.gerarSenha("2345");
			System.out.println("Senha encondada" + senhaEncoded);

			senhaEncoded = senhaUtilsJava.gerarSenha("355");
			System.out.println("Senha encondada novamente" + senhaEncoded);

			System.out.println("A senha é valida " + senhaUtilsJava.senhaValida("123456",senhaEncoded));

			senhaValida = senhaUtilsJava.senhaValida("123456", senhaEncoded);

			if (senhaValida == true){
				System.out.println("A SENHA É VALIDA");
			}else {
				System.out.println("senha não é valida");
			}
			System.out.println(this.qtdaPage);
		};
	}
}
