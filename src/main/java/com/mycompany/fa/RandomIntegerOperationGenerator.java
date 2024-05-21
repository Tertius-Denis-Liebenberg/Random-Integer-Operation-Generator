/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fa;

/**
 *
 * @author Tertius
 */
import java.util.Random;

public class FA1 {
    public static int counter = 0;
    public static void main(String[] args){
        counter += 1;
        String exitString = ("\nThe program ran " + counter + " time(s)");
        
        Random rand = new Random(); // Assighn random variable

        int num1 = rand.nextInt((10 - 1) + 1) + 1; //Create 2 random numbers
        int num2 = rand.nextInt((10 - 1) + 1) + 1;
        
        int opNum = rand.nextInt((4 - 1) + 1) + 1; // Generate random to get opperator
        
        // Run opperator randomly        
        switch (opNum){
            case 1:
                int answerPlus = num1 + num2;
                //Check odd or even
                if(answerPlus % 2 == 0){
                    System.out.println(answerPlus + " is an even number.");
                    //Run program again
                    main(args);
                    break;
                }else{
                    System.out.println(answerPlus + " is an odd number.");
                    System.out.println(exitString);
                    break;
                }
            case 2:
                if(num1 > num2){
                    int answerMinus = num1 - num2;
                    //Check odd or even
                    if(answerMinus % 2 == 0){
                        System.out.println(answerMinus + " is an even number.");
                        //Run program again
                        main(args);
                        break;
                    }else{
                        System.out.println(answerMinus + " is an odd number.");
                        System.out.println(exitString);
                        break;
                    }
                }else{
                    int answerMinus = num2 - num1;
                    //Check odd or even
                    if(answerMinus % 2 == 0){
                        System.out.println(answerMinus + " is an even number.");
                        //Run program again
                        main(args);
                        break;
                    }else{
                        System.out.println(answerMinus + " is an odd number.");
                        System.out.println(exitString);
                        break;
                    }
                }
                
            case 3:
                int answerTimes = num1 * num2;
                //Check odd or even
                if(answerTimes % 2 == 0){
                    System.out.println(answerTimes + " is an even number.");
                    //Run program again
                    main(args);
                    break;
                }else{
                    System.out.println(answerTimes + " is an odd number.");
                    System.out.println(exitString);
                    break;
                }
            case 4:
                //Make sure that the algest number is being devided
                if(num1 > num2){
                    double answerDev = num1 / num2;
                    //Check odd or even
                    if(answerDev % 2 == 0){
                        System.out.println(answerDev + " is an even number.");
                        //Run program again
                        main(args);
                        break;
                    }else{
                        System.out.println(answerDev + " is an odd number.");
                        System.out.println(exitString);
                        break;
                    }
                }else{
                    double answerDev = num2 / num1;
                    //Check odd or even
                    if(answerDev % 2 == 0){
                        System.out.println(answerDev + " is an even number.");
                        //Run program again
                        main(args);
                        break;
                    }else{
                        System.out.println(answerDev + " is an odd number.");
                        System.out.println(exitString);
                        break;
                    }
                }  
        }
    }
}
