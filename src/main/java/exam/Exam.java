package exam;

import java.util.Scanner;

public class Exam {

    public static void printFullName(String fName, String lName){

        System.out.println(fName + " " + lName);

    }

    public static int getPrice (){

        int price = (int)(Math.random() * 10) + 5 ;

        return price;

    }

    public static void printSizes(char[] sizes){

        for (int i = 0; i < sizes.length; i++){

            System.out.println(sizes[i]);

        }

    }

    public static void printOrder(){

        int PRICE = 10;

        System.out.println("What type of burger do you want today? Cheese, ham or turkey?");
        Scanner scanner = new Scanner(System.in);
        String typeOfBurger = scanner.nextLine();

        System.out.println("Welcome to Burger-Joint. Is it true or false that your order will be to go?");
        boolean answer = scanner.nextBoolean();

        System.out.println("Please enter a tip of 0%, 5%,10%, 15% or 20% tip!");
        int tip = scanner.nextInt();

        System.out.println(tip/100);

        int total = PRICE + (PRICE * (tip / 100 ));

        System.out.println("Order total: " + total);

    }

    public static double priceAfterDiscount(double[] productPrices, int discountAmount){
        discountAmount = discountAmount/100;
        int sum = 0;

        for (int i = 0; i < productPrices.length; i++){
            sum += productPrices[i];

        }

        double finalAmount = sum - sum * discountAmount;
        return finalAmount;
    }

    public static void rollDice(){

        //Challenge: Generate two random numbers and store as an array, print output ex:1,2

        int rollOne = (int)(Math.random() * 5) + 1 ;
        int rollTwo = (int)(Math.random() * 5) + 1 ;

        System.out.println(rollOne + "," + rollTwo);


    }

    public static void isPalindrone(){


        System.out.println("Enter a palindrone: ");
        Scanner scanner = new Scanner(System.in);
        String plaindrone = scanner.nextLine();
        boolean isPalindron = false;

        while(isPalindron = false){

            for (int j = 0; j < plaindrone.length(); j++){
                if(plaindrone.charAt(j) == plaindrone.charAt(plaindrone.length()-1 -j)){  //new way found on w3 schools, string methods

                }
            }

        }

    }


    public static void main(String[] args) {

        //Question 1-----------------------------------
        String firstName = "Treasure";
        String lastName = "Davis";

        char[] sizes = {'S', 'M', 'L'};

        final String EXPIRATION_DATE = "9/12/2024";

        //Question 2-----------------------------------
        printFullName(firstName, lastName);

        System.out.println(getPrice());

        printSizes(sizes);

        printOrder();

        //Question 3-----------------------------------------
        double[] prices = {5.0, 5.0, 10.00};
        System.out.println(priceAfterDiscount(prices, 10));

        //Question 4----------------------------------------
        rollDice();

        //Question 5---------------------------------------
        isPalindrone();
    }




}
