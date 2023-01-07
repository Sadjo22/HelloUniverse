package com.MyUniverseProject;

public class Planet {
    String nom;
    String matiere;
    long   diametre;
    int    totalVisiteurs;
    Atmosphere atmosphere = new Atmosphere();
    boolean presenceVaisseau = false;
    static String forme ="Spherique";

    void revolution(String name){
        System.out.println("Je suis la planète "+ name + " et je tourne autour de mon étoile.");
    };

    void rotation(String name){
        System.out.println("Je suis la planète "+ name + " et je tourne sur moi-même.");
    };

    Vaisseau acceuillirVaisseau(Vaisseau vaisseau){

       this.presenceVaisseau = true;
       this.totalVisiteurs = this.totalVisiteurs + vaisseau.nbrePassagers;
       return  vaisseau;

    };


}
