package com.canal.Canal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by meyna on 12/01/2020.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Abonne {

    private String nom;
    private String adresse;
    private String canal;
    private List<Contrats> contrats;

}
