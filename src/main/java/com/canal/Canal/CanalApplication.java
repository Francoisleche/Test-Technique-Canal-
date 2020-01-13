package com.canal.Canal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class CanalApplication {

	public static void main(String[] args) {
		Conseiller conseiller1 = new Conseiller("Adrian","canal");
		List<Contrats> listContrats = new ArrayList<>();
		Contrats contrat1 = new Contrats(1,"14 rue des Lillas");
		Contrats contrat2 = new Contrats(2,"65 rue des Faubourg");
		listContrats.add(contrat1);
		listContrats.add(contrat2);
		Abonne abonne = new Abonne("Laurent","98 rue de Montmorency","canal",listContrats);

		System.out.println("Entrez votre canal :");
		Scanner sc = new Scanner(System.in);
		conseiller1.setCanal(sc.nextLine());

		System.out.println("Entrez la nouvelle adresse :");
		Scanner sc1 = new Scanner(System.in);
		conseiller1.changementAdresse(abonne,sc1.nextLine());

		for(Contrats contrat : abonne.getContrats()){
			System.out.println("Changement adresse sur les contrats : "+contrat.getAdresse());
		}
	}

}
