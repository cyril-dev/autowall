/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autowall;
import java.io.*;
import java.io.IOException;

/**
 *
 * @author ironman
 */
public class Autowall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        
        //ecriture dans un fichier text
        File fichier = new File("script.sh");
        fichier.createNewFile();
        FileWriter fichierw = new FileWriter(fichier);
        fichierw.write("#!/bin/bash");
        fichierw.write("\n");
        fichierw.write("xterm");
        fichierw.write("\n");
        fichierw.close();
        
        //execute la commande choisi
        try{
            Process p = Runtime.getRuntime().exec("bash script.sh");
            java.io.BufferedReader out = new java.io.BufferedReader( new java.io.InputStreamReader( p.getInputStream() ) );
        }catch ( IOException e ){
	// Erreur		
        }
       
    }
    
}
