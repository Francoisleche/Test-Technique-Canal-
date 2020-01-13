package com.canal.Canal;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

class CanalApplicationTests {

	@Test
	public void testChangementAdresse() {
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

		Assert.assertTrue("28 rue Frontignan".equals(abonne.getContrats().get(0).getAdresse()));


		/*AutoEntreprise entreprise = new AutoEntreprise(100,"Capgemini","123456");
		Assert.assertTrue(entreprise.calculerImpot()==25);
		Assert.assertFalse(entreprise.calculerImpot()==40);

		AutoEntreprise entreprise2 = new AutoEntreprise(10000,"Gouiran","456789");
		Assert.assertTrue(entreprise2.calculerImpot()==entreprise2.chiffreAffaires*0.25);*/
	}
}
