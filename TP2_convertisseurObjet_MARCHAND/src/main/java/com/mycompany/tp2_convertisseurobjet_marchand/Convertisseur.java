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
   
    public static double CelciusversKelvin ( double tCelsius) //définition d'une noiuvelle variable
           { tCelsius=tCelsius + 275.13;
             return tCelsius;
                   }
    public static double KelvinversCelsius ( double tKelvin )//définition d'une noiuvelle variable
           { tKelvin=tKelvin - 275.13;
             return tKelvin;
              }
    public static double FarenheitversCelsius ( double tFarenheit ) //définition d'une noiuvelle variable
           { tFarenheit=(tFarenheit-32)/1.8;
             return tFarenheit;
                   }              
    
    
     public static double CelsiusversFarenheit ( double tCelsius ) //définition d'une noiuvelle variable
           { tCelsius=(tCelsius*1.8)+32;
             return tCelsius;
                   }     
     
     public static double KelvinversFarenheit ( double tKelvin ) //définition d'une noiuvelle variable
           { tKelvin=(tKelvin - 275.13)*1.8 +32 ;
             return tKelvin;
                   }    
     
     public static double FarenheitversKelvin ( double tFarenheit ) //définition d'une noiuvelle variable
           { tFarenheit=(tFarenheit - 32)/1.8 +275.13;
             return tFarenheit;
                   }    
     
    }

