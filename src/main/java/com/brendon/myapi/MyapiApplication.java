package com.brendon.myapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brendon.myapi.domain.Usuario;
import com.brendon.myapi.repositories.UsuarioRepository;

@SpringBootApplication
public class MyapiApplication implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario usuario = new Usuario(null, "Brendon Alex", "Brendon", "123");
		Usuario usuario2 = new Usuario(null, "Tania Ribeiro", "Tania", "123");
		
		usuarioRepository.saveAll(Arrays.asList(usuario, usuario2));
	}

}
