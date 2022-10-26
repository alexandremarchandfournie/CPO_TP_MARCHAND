/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_manip_marchand;

/**
 *
 * @author alexandremarchand
 */
public class TP2_manip_MARCHAND {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ; //3 tartiflettes existent alors  car assiette 3 est une variable distincte de assiette 2
        
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        
        
         Tartiflette temp = assiette1 ; //on crée une variable temporaire temp
         assiette1 = assiette2;
         assiette2= temp;
             
          //Moussaka assiette666 = assiette1 ; // les deux lignes sont fausses car un objet d'une certaine classe ne ne peut pas posséder un équivalent dans une autre classse, la classe définit la nature de l'objet et est inchangeable
          //Moussaka assiette667 = new Tartiflette() ; 
        
         // Une référence objet ne pas en référencer une autre qui n'a pas de rapport 
         
      //String [] tab = {"a","b","c","d","e","f","g","h","i","j"};
      //for (int i=0; i < 10; i++) {
        //Moussaka tab[i] = new Moussaka(i) ;
     
    }
}
   

