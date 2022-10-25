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
               System.out.println("Quelle est la nature de la conversion que vous souhaitez convertir ?  Entrez une réponse de type unitédevaleurversunitéconvertie , c'est à dire de type CelsiusversKelvin ou CelciusversFarenheit ou KelvinversCelcius ou KelvinversFarenheit ou FarenheitversCelcius ou FarenheitversKelvin");
                String natureconversion = sc.nextLine();
                System.out.println("Quelle est la valeur? Ecrivez en  chiffre un nombre entier ou décimal " );
                int valeur=sc.nextInt();
                if  ("CelciusversKelvin".equals(natureconversion)) {
                System.out.println(leconvertisseur.CelciusversKelvin(valeur)+"Kelvin") ; //on fait appel à la référence objet
                 }
                if ("CelciusversFarenheit".equals(natureconversion)){
                System.out.println(leconvertisseur.CelciusversFarenheit(valeur)+"Farenheit");} 
                
                if ("KelvinversCelcius".equals(natureconversion)){
                System.out.println(leconvertisseur.KelvinversCelcius(valeur)+"Celcius") ;}
                 
                if ("KelvinversFarenheit".equals(natureconversion)){
                System.out.println(leconvertisseur.KelvinversFarenheit(valeur)+"Farenheit") ;}
                
                  if ("FarenheitversCelcius".equals(natureconversion)){
                System.out.println(leconvertisseur.FarenheitversCelcius(valeur)+"Celcius") ;}
                
                    if ("FarenheitversKelvin".equals(natureconversion)){
                System.out.println(leconvertisseur.FarenheitversKelvin(valeur) +"Kelvin") ;}
                
            
                
                }
                     }
                
}
