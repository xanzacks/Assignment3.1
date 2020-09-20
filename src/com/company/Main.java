package com.company;
//This is E7.5
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Initializing data
        ArrayList<Integer> myList = new ArrayList<Integer>(0);
        int sum = 0;
        Scanner Userin = new Scanner(System.in);
        System.out.println("Please input your number set, separate by space.");
        //separate by space
        String input = Userin.nextLine();
        String numbers[] = input.split(" ");
        //adding all the integers to the arraylist
        for(String iterate:numbers){
            myList.add(Integer.parseInt(iterate));
        }
        //print and calculate the sum
        System.out.print("The sum should be ");
        for(int i = 0; i < myList.size(); i++){
            if(i == 0){
                System.out.print(myList.get(i));
                sum = sum + myList.get(i);
            }
            else if(i % 2 == 0){
                System.out.print(" + " + myList.get(i));
                sum = sum + myList.get(i);
            }
            else{
                System.out.print(" - " + myList.get(i));
                sum = sum - myList.get(i);
            }
        }
        //output
        System.out.print(" = " + sum);
    }
}
