/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_bieres_marchand;

/**
 *
 * @author alexandremarchand
 */
public class TP2_Bieres_MARCHAND {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        BouteilleBiere uneBiere =  new BouteilleBiere();
        uneBiere.Nom= "Cuvée des trolls";
        uneBiere.degreAlcool=7.0 ;
        uneBiere.lireEtiquette();
            
   
BouteilleBiere autreBiere= new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe")