import java.util.Scanner;

public class RoundNegatives {

    public static void main(String[] args)
    {
        // Create a Scanner object and write a prompt for the user to enter a number
         Scanner Scan = new Scanner(System.in);
        // Declare a variable of the correct type that will receive the input from the user.
          System.out.println("A");
          double A= Scan.nextDouble();
        // Declare an variable and write an expression to round the user input
          int B=(int)(A-0.5);

        // ex. int roundedNum=/*expression to round a negative value*/;

        // Write a statement that will output the result in the form below.
        // ex. -3.21 rounded to a whole number is -3
           System.out.println(A+" round to a whole number is "+B);
    }
    }