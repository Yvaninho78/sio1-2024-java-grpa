package fr.dampierre;

import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class App {
    
    public static void main(String[] args) {
        System.out.println("Bonjour !");

        // Récupérer le nombre d'heures travaillées

        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez le nombre d'heures travaillés : ");
        int heuresTravaillees = clavier.nextInt();
        
        // Récupérer le taux horaire
        System.out.print("Entrez le taux horaire : ");
        double tauxHoraire = clavier.nextDouble();

        clavier.close();
        
        // Multiplier le nombre d'heures par le taux horaire
         double salaireBrut = heuresTravaillees * tauxHoraire;
        
         // Afficher le résultat
         // System.out.println("Le salaire brut est de : ");
         // System.out.println(salaireBrut);
         System.out.println("Le salaire brut est de : " + salaireBrut);

    }    

    
}