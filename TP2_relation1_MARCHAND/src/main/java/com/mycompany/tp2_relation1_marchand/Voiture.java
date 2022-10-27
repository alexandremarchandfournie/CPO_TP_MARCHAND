/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_relation1_marchand;

/**
 *
 * @author alexandremarchand
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV; 
    Personne Proprietaire; //on ajoute un attribut de type Personne
   public Voiture ( String mo, String ma,int P) {  // constructeur permettant d'initialiser l'attribut NbCalories pour une valeur entrée en paramètre
             Modele = mo ;
             Marque = ma ;
             PuissanceCV=P;
             Proprietaire=null; //on initialise cette conditiona fin que l'objet voiture aucun lien avec un quelconque propriétaire lorsqu'il est crée
            
     }        
  public String toString () {
  return "Modele: "+ Modele + "  Marque: " + Marque+ "  PuissanceCV "+ PuissanceCV;
}
}
