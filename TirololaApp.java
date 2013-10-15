import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class TirololaApp {
  
 public static void main(String[] args) {
  String userInput;
  userInput = JOptionPane.showInputDialog("Enter a word");//prompts the user to enter a Setswana verb
  /***
    * tests verb the user has entered and returns the corresponding lemma
    */
  if (userInput.contains("olola")){
      String lemma = userInput.replace("olola", "a");//creates the lemma of a word containing "olol"
      JOptionPane.showMessageDialog(null,"lemma is " + lemma);//returns the lemma to the user
      
  }
  else if(userInput.contains("ologa")){
          String lemma = userInput.replace("ologa", "a");//creates the lemma of a word containing "olog"
         JOptionPane.showMessageDialog(null,"lemma is " + lemma);
          
 }
  else if(userInput.contains("olo")){
          String lemma = userInput.replace("olo", "a");//creates the lemma of a word containing "olo"
          JOptionPane.showMessageDialog(null,"lemma is " + lemma);
          
 }
   else if(userInput.contains("ola")){
                String lemma = userInput.replace("ola", "a");//creates the lemma of a word containing "ol"
                JOptionPane.showMessageDialog(null,"lemma is " + lemma);
            }             
  else{ //this executes if either the word the user has entered is a lemma or is not a Setswana verb 
  JOptionPane.showMessageDialog(null,"Lemma does not exist or the word you entered is a lemma.");
}
 }//end of main
 }
  


