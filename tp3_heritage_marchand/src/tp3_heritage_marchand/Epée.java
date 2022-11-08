/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage_marchand;

/**
 *
 * @author alexandremarchand
 */
    public class Epée extends Arme {
   
    int old;
    public Epée ( String nom, int  niv, int old) {
     super(nom,niv);
     if (niv<=100) {
         niv=99;
    } else if ( niv>0 ) {
        niv=old;
    
    } else  { 
    niv=0;
           
     }
               
  } }   
    

