/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package المتنمرون3;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class المتنمرون3 {
    
    public static double max(double[] list) {
		double max = list[0];

		for (int i = 1; i < list.length; i++) {
			if (list[i] > max)
				max = list[i];
		}
		return max;
	}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
     Scanner input = new Scanner(System.in);
		double[] numbers = new double[10]; 

		
		System.out.println("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();


System.out.println("\n");
                System.out.println("The ArrayList:- ");
                for (int i = 0; i < numbers.length; i++)
                {System.out.println(numbers[i]);}
                
                    System.out.println("\n");
                   System.out.println("The maxmum number is " + max(numbers));
}
}