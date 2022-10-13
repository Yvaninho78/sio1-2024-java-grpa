package fr.dampierre;

import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class App {

// public static void main(String[] args) {
    
// int salaire = 400;

// Scanner clavier = new Scanner(System.in);
// System.out.print("Entrez le nombre de ventes de la semaine : ");
// int nbVentesSemaine = clavier.nextInt();

// if (nbVentesSemaine >= 10) {
// ajouter la prime
//      salaire = salaire + 250; 
    
// }

// System.out.println("Votre salaire est de : " + salaire);

// }


public static void main(String[] args) {
    
    int nb;

   System.out.print("Veuillez saisir un entier : ");

   Scanner clavier = new Scanner(System.in);
   
   nb = clavier.nextInt();

   if (nb%2 == 0) {
    System.out.println("L'entier que vous avez saisi est pair");
   } else {
    System.out.println("L'entier que vous avez saisi est impair");
   }
   clavier.close();
}









   
   
   
   

   
} 
   
   
    // int quota = 10;

    // Scanner clavier = new Scanner(System.in);

    // System.out.print("Entrez le nombre de ventes de cette semaine : ");

    // int Ventes = clavier.nextInt();

    // if ( Ventes >= 10) {
    //     System.out.println("Félicitations !");
    // } else {

    //     int nbVentesManquantes = quota - Ventes; 
    //     System.out.println("Il vous manque "+ nbVentesManquantes + " ventes pour atteindre le quota");
        
    // }






    // public static void main(String[] args) {
    //   // Exercice 1

    //   //  int heures = 12;
    //  //   int minutes = 34;
    // // int secondes = 56;

    // // int nbSecondesDepuisminuit = heures * 60 * 60 + minutes * 60 + secondes;
     
    // // System.out.println("Le nombre de secondes passées depuis est : " + nbSecondesDepuisminuit);

    
    // // Exercice 2 


    //  Scanner clavier = new Scanner(System.in);
    //  System.out.print("Entrez les heures : ");
    //   int heures = clavier.nextInt();
    //   System.out.print("Entrez les minutes : ");
    //   int minutes = clavier.nextInt();
    //  System.out.print("Entrez les secondes : ");
    //  int secondes = clavier.nextInt();
    // clavier.close(); 

    //int nbSecondesDepuisminuit = heures * 60 * 60 + minutes * 60 + secondes;

    // System.out.println("Le nombre de secondes passées depuis est : " + nbSecondesDepuisminuit);
        


      
    
    
    
    
    // public static void main(String[] args) {
    //     System.out.println("Bonjour !");

    //     // Récupérer le nombre d'heures travaillées

    //     Scanner clavier = new Scanner(System.in);
    //     System.out.print("Entrez le nombre d'heures travaillés : ");
    //     int heuresTravaillees = clavier.nextInt();
        
    //     // Récupérer le taux horaire
    //     System.out.print("Entrez le taux horaire : ");
    //     double tauxHoraire = clavier.nextDouble();

    //     clavier.close();
        
    //     // Multiplier le nombre d'heures par le taux horaire
    //      double salaireBrut = heuresTravaillees * tauxHoraire;
        
    //      // Afficher le résultat
    //      // System.out.println("Le salaire brut est de : ");
    //      // System.out.println(salaireBrut);
    //      System.out.println("Le salaire brut est de : " + salaireBrut);

    // }    

    
