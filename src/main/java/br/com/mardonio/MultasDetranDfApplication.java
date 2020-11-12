package br.com.mardonio;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.mardonio.domain.Multa;
import br.com.mardonio.service.MultasService;

@SpringBootApplication
public class MultasDetranDfApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultasDetranDfApplication.class, args);
	}

}
