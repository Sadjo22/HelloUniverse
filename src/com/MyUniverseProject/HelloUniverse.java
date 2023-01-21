package com.MyUniverseProject;
import javax.swing.*;
import java.util.Scanner;

public class HelloUniverse {
    public static void main(String... args){
        Car peguyCar = new Car();
        peguyCar.automatic = false;
        peguyCar.color     = "black";
        peguyCar.nrDoors   = 4;
        System.out.println("la voiture de peguy a:"+peguyCar.nrDoors+" "+"et est de couleur:"+peguyCar.color);

        Planet mercure =  new Planet("Mercure",4878,"tellurique");
        Planet venus   =  new Planet("Venus",12100,"tellurique");
        Planet terre   =  new Planet("terre",12756,"tellurique");
        Planet mars    =  new Planet("Mars",6792,"tellurique");
        Planet jupiter =  new Planet("Jupiter",142984,"gazeuse");
        Planet saturne =  new Planet("Saturne",120536,"gazeuse");
        Planet uranus  =  new Planet("Uranus",51118,"gazeuse");
        Planet nepturne = new Planet("Nepturne",49532,"gazeuse");
        Planet pluton  =  new Planet("Pluton",2300,"gazeuse");

        peguyCar.honk();
        mars.rotation(mars.nom);

        Vaisseau vaisseauMars = new Vaisseau();
        vaisseauMars.nbrePassagers = 9;
        vaisseauMars.typeVaisseau = "FREGATE";

        Vaisseau vaisseauMars2 = new Vaisseau();
        vaisseauMars.nbrePassagers = 42;
        vaisseauMars.typeVaisseau = "FRESUS";


        uranus.atmosphere.hydrogène = 83f;
        uranus.atmosphere.hélium = 15f;
        uranus.atmosphere.méthane = 2.5f;

        System.out.println("l'atmosphere d'" + uranus.nom + " est compose de :");
        System.out.println(uranus.atmosphere.hydrogène+"% D'hydrogène");
        System.out.println(uranus.atmosphere.hélium+"% D'hélium");
        System.out.println(uranus.atmosphere.méthane+"% De methane");
        System.out.println("la forme d'une planete est: "+Planet.forme);
        System.out.println("la forme de "+mars.nom+ "est: "+Planet.forme);
        Planet.expansion(10.5);
        Planet.expansion(14.2);
        System.out.println(Planet.nbPlanetesDecouvertes);

        VaisseauDeGuerre chasseur = new VaisseauDeGuerre();
        chasseur.typeVaisseau = "CHASSEUR";
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier = 2;

        Vaisseau  vaisseauMonde = new VaisseauCivil();
        vaisseauMonde.typeVaisseau = "vaisseau Monde";
        vaisseauMonde.blindage = 4784;
        vaisseauMonde.resistanceDuBouclier = 30;
        Scanner scan = new Scanner(System.in);
        System.out.println("Quelle vaisseau souhaiteriez-vous utiliser?");
        String txt = scan.nextLine();
        System.out.println("sur quelle planete souhaiteriez-vous VOUS POSER?");
        String txt1 = scan.nextLine();

    }

}
