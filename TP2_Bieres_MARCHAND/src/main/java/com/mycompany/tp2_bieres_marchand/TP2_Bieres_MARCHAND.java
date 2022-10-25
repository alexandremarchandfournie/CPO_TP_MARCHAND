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
        
   
// les lignes corrspondant aux deux objets suivant sont mis en commentaire car la méthode main() n'est plus valable  
//BouteilleBiere uneBiere = new BouteilleBiere() ; // on crée un réference d'un nouvel objet de type bouteille bierre, nommée uneBiere
  //uneBiere.Nom= "Cuvée des trolls"; // on affecte des attributs à notre objet
  //uneBiere.degreAlcool=7.0 ;
  //uneBiere.brasserie="Dubuisson";
  //uneBiere.ouverte=false;
  //uneBiere.lireEtiquette(); //procédure

//BouteilleBiere autreBiere= new BouteilleBiere();
//autreBiere.Nom="Leffe";
//autreBiere.degreAlcool=6.6;
//autreBiere.brasserie= "Abbaye de Leffe";
//autreBiere.lireEtiquette();
     
 BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
7.0 ,"Dubuisson") ; //on remarque que les natures des variables utilisées sont automatiquemùenyt indiquées juste avant celles ci
uneBiere.lireEtiquette(); // après execution de la ligne, on remarque que les informations sont toujours correctes

 BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6
,"Abbaye de Leffe") ;
 autreBiere.lireEtiquette(); // idem, inforamtions correctes
 autreBiere.Décapsuler();
 BouteilleBiere lameilleureBiere = new BouteilleBiere("Corona", 4.5
,"Coronaland") ;
 lameilleureBiere.lireEtiquette(); 
 lameilleureBiere.Décapsuler();
 
 BouteilleBiere unemoinsbonneBiere = new BouteilleBiere("La Bihr", 1.4
,"La Fabrique à Peuf") ;
unemoinsbonneBiere.lireEtiquette(); 
unemoinsbonneBiere.Décapsuler();
 
 BouteilleBiere uneencoremoinsbonnebierre = new BouteilleBiere("La Benj'", 33
,"La Suisse en folie") ;
uneencoremoinsbonnebierre.lireEtiquette(); 
uneencoremoinsbonnebierre.Décapsuler(); //la valeur de ouverte est bien mise à jour
   
 
  System.out.println(uneBiere ); // le package de la classe de  l'objet est affiché
    }
      }

