/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_convertisseurobjet_marchand;

import java.util.Scanner;

/**
 *
 * @author alexandremarchand
 */
public class TP2_convertisseurObjet_MARCHAND {

    public static void main(String[] args) {
        
        Scanner sc; //on définit le scanner nécessaire pour intéragir avec l'utilisateur du programme
        sc= new Scanner ( System.in);
        
        System.out.println("Hello World!");
        Convertisseur leconvertisseur = new Convertisseur() ; // on crée un réference d'un nouvel objet de type bouteille convertisseur, nommé le Convertisseur
        System.out.println("Voulez vous convertir");
        String reputilisateur = sc.nextLine();
        if ( "oui".equals(reputilisateur)) { // on efectue un equals pour comparer chaines de caractères
               System.out.println("Quelle est la nature de la conversion que vous souhaitez convertir ?  Entrez une réponse de type unitédevaleurversunitéconvertie , c'est à dire de type CelsiusversKelvin ou CelciusversFarenheit ou KelvinversCelsius ou KelvinversFarenheit ou FarenheitversCelsius ou FarenheitversKelvin");
                String natureconversion = sc.nextLine();
                System.out.println("Quelle est la valeur? Ecrivez en  chiffre un nombre entier ou décimal " );
                int valeur=sc.nextInt();
                if  ("CelsiusversKelvin".equals(natureconversion)) {
                System.out.println(leconvertisseur.CelsiusversKelvin(valeur)+"Kelvin") ; //on fait appel à la référence objet
                 }
                if ("CelsiusversFarenheit".equals(natureconversion)){
                System.out.println(leconvertisseur.CelsiusversFarenheit(valeur)+"Farenheit");} 
                
                if ("KelvinversCelsius".equals(natureconversion)){
                System.out.println(leconvertisseur.KelvinversCelsius(valeur)+"Celsius") ;}
                 
                if ("KelvinversFarenheit".equals(natureconversion)){
                System.out.println(leconvertisseur.KelvinversFarenheit(valeur)+"Farenheit") ;}
                
                  if ("FarenheitversCelsius".equals(natureconversion)){
                System.out.println(leconvertisseur.FarenheitversCelsius(valeur)+"Celsius") ;}
                
                    if ("FarenheitversKelvin".equals(natureconversion)){
                System.out.println(leconvertisseur.FarenheitversKelvin(valeur) +"Kelvin") ;}
                
            
                
                }
                     }
                
}
