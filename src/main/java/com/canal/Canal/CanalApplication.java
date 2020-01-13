package com.canal.Canal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CanalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CanalApplication.class, args);

		Conseiller conseiller1 = new Conseiller("Adrian","canal1");
		List<Contrats> listContrats = new ArrayList<>();
		Contrats contrat1 = new Contrats(1,"14 rue des Lillas");
		Contrats contrat2 = new Contrats(2,"65 rue des Faubourg");
		listContrats.add(contrat1);
		listContrats.add(contrat2);
		Abonne abonne = new Abonne("Laurent","98 rue de Montmorency","canal1",listContrats);

		for(Contrats contrat : abonne.getContrats()){
			System.out.println(" 1 :"+contrat.getAdresse());
		}

		conseiller1.changementAdresse(abonne,"28 rue Frontignan");


		for(Contrats contrat : abonne.getContrats()){
			System.out.println(" 2 :"+contrat.getAdresse());
		}
	}

}
