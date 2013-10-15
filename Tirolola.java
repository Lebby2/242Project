/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
/**
 *
 * @author BATENDI B SAMSON
 */
public class Tirolola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("Tirolola.txt");
        try {
           
            Scanner input = new Scanner(file);
           System.out.println("TIROLOLA --> TIRA");
            while(input.hasNext()){            
            String current = input.next();
            if (current.contains("olola")){
            String lemma = current.replace("olola", "a");
            System.out.println(current+" --> " +lemma);
            }
            else if(current.contains("ologa")){
                String lemma = current.replace("ologa", "a");
                System.out.println(current+" --> " +lemma);
            }
            else if(current.contains("olo")){
                String lemma = current.replace("olo", "a");
                System.out.println(current+" --> " +lemma);
            }
            else if(current.contains("ola")){
                String lemma = current.replace("ola", "a");
                System.out.println(current+" --> " +lemma);
            }             
            }
        }
    
        
        catch(FileNotFoundException e){
            System.err.format("File does not exist");
        }
        
    }
    
}

