package fr.dampierre;

import java.util.Random;
import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class App2 {


public static void main(String[] args) {
    Random generateur = new Random();
    int laCase = 0;
    while (laCase != 20) {
        // début de la partie
        laCase = 0;
        for (int i = 1; i <= 5; i++){
        // lancer le dé 
        int lancer = generateur.nextInt(6) + 1;
        System.out.println("Vous avez fait " + lancer);
        // avancer le pion d'autant de cases
        laCase = laCase + lancer;
        System.out.println("Vous êtes à la case " + laCase);
       } 
    
    
    if (laCase == 20) {
        System.out.println("Vous avez gagné !");
    }  else {
        System.out.println("Vous avez perdu !");
    }
 }

}

}














    //  public static void main(String[] args) {
    
// System.out.print("Entrez le nombres d'heures travaillées : ");

// Scanner clavier = new Scanner (System.in);
// int nbHeures = clavier.nextInt();

// double tauxHoraire = 15.50;

// while (nbHeures > 42  || nbHeures < 0) {

//           System.out.println("Vous devez donnez un nombre entre 0 et 42 svp ! ");
//           nbHeures = clavier.nextInt();
// }

// double salaire = tauxHoraire * nbHeures;
// System.out.println("Salaire : " + salaire);

// }







    //     int coutCafe = 100;


//     Scanner clavier = new Scanner(System.in);

//     System.out.print("Entrez le nombre de pièces de 1 : ");
   
//     int piece1 = clavier.nextInt();
   
//     System.out.print("Entrez le nombre de pièces de 5 : ");
   
//     int piece5= clavier.nextInt();
  
//     System.out.print("Entrez le nombre de pièces de 10 : ");
  
//     int piece10 = clavier.nextInt();
  
//     System.out.print("Entrez le nombre de pièces de 20 :  ");
   
//     int piece20 = clavier.nextInt();
   
//     System.out.print("Entrez le nombre de pièces de 50 :  ");
   
//     int piece50= clavier.nextInt();
  
//     clavier.close();

//     double totalCentimes =  piece1*1 + piece5*5 + piece10*10 + piece20*20 + piece50*50;

//     if (coutCafe == totalCentimes) {
//         System.out.println("Vous avez pile le prix pour acheter le cafe");
    
//     } else if (totalCentimes > coutCafe){
//         int trop = totalCentimes - coutCafe
//         System.out.println("Il vous restera " + trop + " centimes après avoir payé votre café ");
        
//     } else (totalCentimes < coutCafe){

//         System.out.println("Il vous restera " + trop + " centimes après avoir payé votre café ");  
//     }

//  }

// }

// public static void main(String[] args) {
    
//     int quota = 10;

//     Scanner clavier = new Scanner(System.in);

//     System.out.print("Entrez le nombre de ventes de cette semaine : ");

//     int Ventes = clavier.nextInt();

//     if ( Ventes >= 10) {
//         System.out.println("Félicitations !");
//     } else {

//         int nbVentesManquantes = quota - Ventes; 
//         System.out.println("Il vous manque "+ nbVentesManquantes + " ventes pour atteindre le quota");
        
//     }

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

    
