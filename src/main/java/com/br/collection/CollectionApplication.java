package com.br.collection;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CollectionApplication {

	public static void main(String[] args) {

		SpringApplication.run(CollectionApplication.class, args);
	}

	@RequestMapping("/")
	String teste(){
		Carro meuCarro = new Carro();
		meuCarro.fabricante = "Honda";
		meuCarro.modelo = "Civic";
		meuCarro.cor = "Prata";
		meuCarro.anoDeFabricacao = 2020;

		Usuario usuario = new Usuario();
		usuario.email = "emailgabriel@gmail.com";
		usuario.nome = "Gabriel";

		meuCarro.usuario = usuario;

		Endereco endereco = new Endereco();
		endereco.rua = "Rua 1";
		endereco.endereco = "Rua 2";
		endereco.CEP = "12.345-678";

		usuario.endereco = endereco;

		Gson gson = new Gson();
		String json = gson.toJson(meuCarro);

		return json;
	}

}
