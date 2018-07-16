package binaryoperations;

import java.io.IOException;
import static java.lang.System.in;
import java.util.Scanner;

public class BinaryStrings {
    public static void main(String[] args) throws IOException {
        try(Scanner in = new Scanner(System.in)) {
        	
            SumAndMultiply operation = new SumAndMultiply();
            System.out.print("Enter the first binary number:  ");
                String x = in.next();
            System.out.print("Enter the second binary number:");
                String y = in.next();
            System.out.println("Sum of the binary numbers:" + operation.BinarySum(x, y));
            
            System.out.println("Product of the binary numbers:" + operation.BinaryProd(x, y));
            
        } catch(NumberFormatException e) {
            System.out.println("Entered a non Binary digit");
        } finally {
                in.close();
            }
        }
    }