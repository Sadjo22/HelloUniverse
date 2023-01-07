package com.MyUniverseProject;
import javax.swing.*;

public class HelloUniverse {
    public static void main(String... args){
        Car peguyCar = new Car();
        peguyCar.automatic = false;
        peguyCar.color     = "black";
        peguyCar.nrDoors   = 4;
        System.out.println("la voiture de peguy a:"+peguyCar.nrDoors+" "+"et est de couleur:"+peguyCar.color);
        Planet mercure = new Planet();
        mercure.diametre=4878;
        mercure.nom     ="Mercure";
        mercure.matiere ="tellurique";
        Planet venus   = new Planet();
        venus.diametre=12100;
        venus.nom     ="Venus";
        venus.matiere ="tellurique";
        Planet terre   = new Planet();
        terre.diametre=12756;
        terre.nom     ="Terre";
        terre.matiere ="tellurique";
        Planet mars    = new Planet();
        mars.diametre=6792;
        mars.nom     ="Mars";
        mars.matiere ="tellurique";
        Planet jupiter = new Planet();
        jupiter.diametre=142984;
        jupiter.nom     ="Jupiter";
        jupiter.matiere ="gazeuse";
        Planet saturne = new Planet();
        saturne.diametre=120536;
        saturne.nom     ="Saturne";
        saturne.matiere ="gazeuse";
        Planet uranus  = new Planet();
        uranus.diametre=51118;
        uranus.nom     ="Uranus";
        uranus.matiere ="gazeuse";
        Planet neptune = new Planet();
        neptune.diametre=49532;
        neptune.nom     ="Neptune";
        neptune.matiere ="gazeuse";
        Planet pluton   = new Planet();
        pluton.diametre=2300;
        pluton.nom     ="Pluton";
        pluton.matiere ="gazeuse";
        /*Planet mercure =  new Planet("Mercure",4878,"tellurique");
        Planet venus   =  new Planet("Venus",12100,"tellurique");
        Planet terre   =  new Planet("terre",12756,"tellurique");
        Planet mars    =  new Planet("Mars",6792,"tellurique");
        Planet jupiter =  new Planet("Jupiter",142984,"gazeuse");
        Planet saturne =  new Planet("Saturne",120536,"gazeuse");
        Planet uranus  =  new Planet("Uranus",51118,"gazeuse");
        Planet nepturne = new Planet("Nepturne",49532,"gazeuse");
        Planet pluton  =  new Planet("Pluton",2300,"gazeuse");*/

        Planet neuf    =  new Planet();
        System.out.println(jupiter.nom +" est une planète"+jupiter.matiere +" avec un diamètre de"+ jupiter.diametre +"kilomètres.");
        System.out.println(neuf.nom+" est une planète "+neuf.matiere+" avec un diamètre de "+neuf.diametre+" kilomètres.");

        peguyCar.honk();
        neptune.revolution(neptune.nom);
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

    }

}
