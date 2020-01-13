package com.canal.Canal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by meyna on 12/01/2020.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conseiller {

    private String nom;
    private String canal;

    public void changementAdresse(Abonne abonne,String newAdresse){
        if(canal.equals(abonne.getCanal())){
            if(!newAdresse.isEmpty() && newAdresse!=null){
                for(Contrats contrat : abonne.getContrats()){
                    contrat.setAdresse(newAdresse);
                }
            }else{
                System.err.println("La nouvelle adresse est null ou vide.");
            }
        }else{
            System.err.println("Le canal n'est pas bon.");
        }
    }
}
