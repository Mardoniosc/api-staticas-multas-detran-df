package br.com.mardonio.resource;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mardonio.domain.Multa;
import br.com.mardonio.service.MultasService;

@RestController
@RequestMapping("/multas")
public class Multas2019Resource {
	
	@GetMapping("/2019")
	public ResponseEntity<List<Multa>> getAll2019() throws IOException, NoSuchFileException {
		String path = "./static/multas2019.json";
		List<Multa> multas = MultasService.readListFrom(path);
		return ResponseEntity.ok().body(multas);
	}
	
	@GetMapping("/2020")
	public ResponseEntity<List<Multa>> getAll2020() throws IOException, NoSuchFileException {
		String path = "./static/multas2020.json";
		List<Multa> multas = MultasService.readListFrom(path);
		return ResponseEntity.ok().body(multas);
	}
	
	
}
