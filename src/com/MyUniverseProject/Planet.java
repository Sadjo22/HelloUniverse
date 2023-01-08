package com.MyUniverseProject;

public class Planet {
    String nom;
    String matiere;
    long   diametre;
    int    totalVisiteurs;
    Atmosphere atmosphere = new Atmosphere();
    boolean presenceVaisseau = false;
    static String forme ="Spherique";
    static int nbPlanetesDecouvertes;

    Planet(String nom, long diametre, String matiere){
        this.nom = nom;
        this.matiere = matiere;
        this.diametre = diametre;
        nbPlanetesDecouvertes++;
    }

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

    static void expansion(double distance){
        if(distance < 14){
            System.out.println("Oh la la mais c'est super rapide !");
        }else{
            System.out.println("Je rêve ou c'est plus rapide que la lumière ?");
        }
    }




}
