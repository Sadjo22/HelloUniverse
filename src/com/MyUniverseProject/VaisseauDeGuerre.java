package com.MyUniverseProject;

public class VaisseauDeGuerre extends Vaisseau{

    void attaque(Vaisseau vaisseau, String arme,  int duree){
       /* if (vaisseau instanceof VaisseauDeGuerre ){
            System.out.println("true");
        }*/
        System.out.println("Attaque impossible, l'armement est désactivé");
       /* vaisseau.resistanceDuBouclier = 0;
        vaisseau.blindage = vaisseau.blindage/2;*/
    }

    boolean desactiverArmes(){
        System.out.println("Désactivation des armes d'un vaisseau de type "+this.typeVaisseau);
        return true;
    }
}
