package com.MyUniverseProject;

import javax.swing.*;

public class HelloUniverse {
    public static void main(String... args){

             int nbPlanetes;
             for(nbPlanetes=7;nbPlanetes<=9;nbPlanetes++){
                 switch(nbPlanetes){
                     case 7:
                         System.out.printf("On sait qu'au 16ème siècle, seules %d planètes avaient été découvertes",nbPlanetes);
                         break;
                     case 8 :
                         System.out.printf("On sait que le nombre de planètes est passé de %d à %d au 17ème siècle, mais il a également été réduit de %d à 8 en 2006",7,nbPlanetes,9);
                         break;
                     case 9 :
                         System.out.printf("On sait que le nombre de planètes est passé de 8 à %d au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8",nbPlanetes);
                         break;
                     default :
                         System.out.printf("Le programme ne peut pas fournir de résultat pour %d",nbPlanetes);
                 }
             }




    }

}
