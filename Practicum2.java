package practicum2;
import java.util.Scanner;

public class Practicum2 {
 public static void main(String[] args) {
     Scanner userInput = new Scanner(System.in);
             
     System.out.println("Hoe heet je?");
     String naam = userInput.nextLine( );
 
     System.out.println("Wat is je geboortejaar?");
     int geboortejaar = userInput.nextInt();
         
int leeftijd = (2014 - geboortejaar);
double venusleeftijd = (leeftijd / 0.62);
        
System.out.println("Beste " + naam + ", in 2014 zal je leeftijd " + leeftijd + " zijn.");
System.out.println("En je leeftijd is dan " + venusleeftijd + "  in Venusjaren." );

 }
 }