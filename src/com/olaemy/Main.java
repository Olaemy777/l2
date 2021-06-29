package com.olaemy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        print35();
        printOdd100();
        System.out.println(sumTwo());
        System.out.println(maxNumbers());
        int [] array={3,-3,7,4,5,4,3};
        System.out.println(checkEnds(array));
        System.out.println(check13(array));

    }
    public static void printOdd100(){
        for (int i= 1;i<100;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }

    public static void print35(){
        for(int i= 1;i<=100;i++){
            if (i%3==0){
                System.out.println("Divided by 3: "+ i); }
            if (i%5==0){
                System.out.println("Divided by 5: "+ i); }
            if (i%15==0 ){
                System.out.println("Divided by 3 and 5: "+ i);
            }

        }
    }

    public static boolean sumTwo(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a= scanner.nextInt();
        System.out.println(a);
        System.out.print("Enter second number: ");
        int b= scanner.nextInt();
        System.out.println(b);
        System.out.print("Enter third number:" );
        int c= scanner.nextInt();
        return a+b==c;
    }

    public static boolean maxNumbers(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a= scanner.nextInt();
        System.out.println(a);
        System.out.print("Enter second number: ");
        int b= scanner.nextInt();
        System.out.println(b);
        System.out.print("Enter third number:" );
        int c= scanner.nextInt();
        System.out.println(c);
        return b>a & c>b;
    }

    public static boolean checkEnds(int[] array){
        if (array.length>=2)
        return array[0]==3 || array[array.length-1]==3;
        else return false;
    }
    public static boolean  check13(int[] array){
        for (int j : array) {
            if (j == 1 || j == 3)
                return true;

        }
        return false;
    }

}



