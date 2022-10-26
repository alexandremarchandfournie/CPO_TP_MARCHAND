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
   public Voiture ( String mo, String ma,int P) {  // constructeur permettant d'initialiser l'attribut NbCalories pour une valeur entrée en paramètre
             Modele = mo ;
             Marque = ma ;
             PuissanceCV=P;
     }        
  public String toString () {
  return "Modele: "+ Modele + "  Marque: " + Marque+ "  PuissanceCV "+ PuissanceCV;
}
}
