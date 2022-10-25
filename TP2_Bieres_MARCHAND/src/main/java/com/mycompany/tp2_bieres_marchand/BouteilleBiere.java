/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_bieres_marchand;


//première façon de définir la classe BouteilleBierre :
public class BouteilleBiere { // on définit ici le type d'objet corrspondant à une bouteilleBouteilleBierre
    //première façon de définir la classe BouteilleBierre :
    String Nom;  
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    
   public void lireEtiquette() { // on ajoute la m"thode permettant de lire les informations de la bierre
System.out.println("Bouteille de " + Nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie );}
   
   public void Décapsuler() { // on ajoute la méthode permettant de mettre à jour la variable booléen "ouverte" à jour
       if ( ouverte== true ) { //éxecution de la lignes suivante dans le cas pour lequel la bierre  a déja été ouverte
            System.out.println("erreur : biere déjà ouverte");} //s message d'erreur
       else { ouverte=true;  }} // mise à jour de la variable ouverte passant de false à true

   public String toString() { // la technique fonctionne de façon similaire que lire etiquete
   String chaine_a_retourner;
   chaine_a_retourner = ( Nom + " (" + degreAlcool + " degrés)Ouverte? ");
    if (ouverte == true ) {
       chaine_a_retourner += "oui";
      } 
    else { chaine_a_retourner += "non"; } ;
return chaine_a_retourner ;
}
   //nouvelle façon de définir cette meme classe avec un constructeur:
public BouteilleBiere(String unNom,double unDegre, String uneBrasserie) 
{
   Nom = unNom;
   degreAlcool = unDegre;
   brasserie = uneBrasserie;
   ouverte = false;
  
   
 }}
 

