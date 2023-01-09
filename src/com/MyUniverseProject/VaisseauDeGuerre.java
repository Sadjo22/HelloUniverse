package com.MyUniverseProject;

public class VaisseauDeGuerre extends Vaisseau{

    void attaque(Vaisseau vaisseau, String arme,  int duree){
        System.out.println("Un vaisseau de type "+ this.typeVaisseau +" attaque un vaisseau de type " +vaisseau.typeVaisseau+" en utilisant l'arme "+arme+" pendant "+ duree+  " minutes.");
        vaisseau.resistanceDuBouclier = 0;
        vaisseau.blindage = vaisseau.blindage/2;
    }
}
