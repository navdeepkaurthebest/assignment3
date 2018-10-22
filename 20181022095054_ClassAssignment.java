package classassignment;

import java.util.Scanner;
import java.util.Random;

public class ClassAssignment {

    public static void main(String[] args) {
        int number;
        int R;
        int i;
        int j;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many lines ?  ");
        number = keyboard.nextInt();
        Random ranObj = new Random();

        for (i = 0; i <= number; i++) {
           
        for (j = 0; j <= 10; j++) {
            R = ranObj.nextInt(10);
            if ( j==number) {
                System.out.println(" * ");
            } else 
                System.out.println(" - ");
            
        }}
        System.out.println("        ");
        System.out.println("End of our program");
    
}}
