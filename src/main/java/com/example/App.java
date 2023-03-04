package com.example;

import com.example.entities.Beer;
import com.example.repositories.BeerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);
		BeerRepository beerRepo = context.getBean(BeerRepository.class);
	}
	Beer beer1 = new Beer(null,"La Salve Lager","Esta cerveza Pale Lager elaborada con los ingredientes de la mayor calidad, se caracteriza por su extraordinario sabor, y destaca por su modernidad y autenticidad. Sin duda, La Salve Lager es una cerveza genuina, hecha con pasión.",1.27,"dorado intenso",5.5,true);
	Beer beer2 = new Beer(null,"FRANZISKANER WEISSBIER","Con un proceso de alta fermentación y hecha solamente con ingredientes naturales, Franziskaner Natur posee un sabor delicado y con la turbidez propia de la levadura.",1.65,"dorado",5.0,true);
	Beer beer3 = new Beer(null,"Mahou cinco estrellas","¡Nuestra cerveza Mahou Cinco Estrellas tiene un sabor muy grande! Fue nuestra primera cerveza especial, con maestría cervecera. Una Pale Lager hecha para gente con sabor, y aunque la primera se fabricara en 1969, es una cerveza que sabe a un montón de cosas nuevas.",1.60,"dorado",5.5,true);

	// beerRepo.saveAll(List.of(beer1,beer2,beer3));
}
