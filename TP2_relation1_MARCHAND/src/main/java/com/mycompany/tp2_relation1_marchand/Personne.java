/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_relation1_marchand;

/**
 *
 * @author alexandremarchand
 */
public class Personne {
    String nom;
    String prenom;
   public Personne ( String n, String p) {  // constructeur permettant d'initialiser l'attribut NbCalories pour une valeur entrée en paramètre
             nom = n ;
             prenom=p ;
     }        
  public String toString () {
  return "Nom:"+ nom + "  Prénom" + prenom;
}
}

