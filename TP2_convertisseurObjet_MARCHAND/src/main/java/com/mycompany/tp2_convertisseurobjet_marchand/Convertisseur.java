/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_convertisseurobjet_marchand;

/**
 *
 * @author alexandremarchand
 */
public class Convertisseur {
    int nbConversions;
    public Convertisseur () { // caracteristique fonction convertisseur
    nbConversions =0 ;}
   
    public double CelsiusversKelvin ( double tCelsius ) //définition d'une noiuvelle variable
           { tCelsius=tCelsius + 275.13;
           nbConversions++; //incrémentation nbConversions
             return ( tCelsius );
                   }
    public double KelvinversCelsius ( double tKelvin )//définition d'une noiuvelle variable
           { tKelvin=tKelvin - 275.13;
           nbConversions++; 
             return tKelvin;
              }
    public double FarenheitversCelsius ( double tFarenheit ) //définition d'une noiuvelle variable
           { tFarenheit=(tFarenheit-32)/1.8;
           nbConversions++;
             return tFarenheit;
                   }              
    
    
     public double CelsiusversFarenheit ( double tCelsius ) //définition d'une noiuvelle variable
           { tCelsius=(tCelsius*1.8)+32;
            nbConversions++;
             return tCelsius;
                   }     
     
     public double KelvinversFarenheit ( double tKelvin ) //définition d'une noiuvelle variable
           { tKelvin=(tKelvin - 275.13)*1.8 +32 ;
           nbConversions++;
             return tKelvin;
                   }    
     
     public double FarenheitversKelvin ( double tFarenheit ) //définition d'une noiuvelle variable
           { tFarenheit=(tFarenheit - 32)/1.8 +275.13;
            nbConversions++;
             return tFarenheit;
                   }    
     
     public String toString () {
  return "nb de conversions"+ nbConversions;
     }

     
    }

