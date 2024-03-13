/**
 * 
 */
package com.one;
import java.util.Scanner;


public class Grade 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter the score: ");

        int score =scanner.nextInt();

        String grade;

        if(score>=90)
        {
            System.out.println("You've got grade A ");
            grade ="A";
        }

        else if(score>=80)
        {
            System.out.println("You've got B grade");
            grade ="B";
        }

        else if(score>=70)
        {
            System.out.println("You've got C grade");
            grade ="C";
        }

        else if(score>=60)
        {
            System.out.println("You've got D grade");
            grade ="D";
        }

        else
        {
            System.out.println("You are failed");
        }
        scanner.close();
	}

}
