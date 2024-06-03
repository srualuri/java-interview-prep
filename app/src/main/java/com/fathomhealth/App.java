package com.fathomhealth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.File;

public class App {

  public String getGreeting() {
     
    final String DELIMITER = ",";
    String line = null;
    try (BufferedReader reader =  new BufferedReader(new FileReader("/workspaces/java-interview-prep/app/src/test/resources/com/fathomhealth/rows.csv"))){

      while ((line = reader.readLine()) != null)   //returns a Boolean value  
      {  
        String[] log = line.split(DELIMITER);    // use comma as separator  
        System.out.println("Employee [First Name=" + log[0] + ", Last Name=" + log[1] + ", Designation=" + log[2] + "]");  
        
        
        } 
      }   
   catch (IOException e) {
      throw new RuntimeException(e);

    } 
    Scanner sc = null;
    try {
      sc = new Scanner(new File("/workspaces/java-interview-prep/app/src/test/resources/com/fathomhealth/rows.csv"));  

      sc.useDelimiter(",");   //sets the delimiter pattern  
      while (sc.hasNext())  //returns a boolean value  
        {  
          
        System.out.println(sc.next());  //find and returns the next complete token from this scanner  
        }   
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      if (sc != null) {
        sc.close();  //closes the scanner
      }
      
    }
    
        
    
    return "Hello World!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
  }
}
