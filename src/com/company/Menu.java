package com.company;
import com.company.TT2.*;
import com.company.TT3.*;

import java.io.*;
import java.util.Scanner;

public class Menu {

    public static void menu() {

        int sum=0, time=0, TIMES=12, SIZE=5000;
        int totalswap = 0, totalcomp = 0;

        String[] menu_items = new String[] {"Option 1: IntByReference", "Option 2: Matrix", "Option 3: Calculator", "Option 4: Bubble Sort", "Option 5: Insertion Sort", "Option 6: Merge Sort", "Option 7: Selection Sort"};

        for(int i = 0; i < menu_items.length; i++){
            System.out.println(menu_items[i]);
            System.out.println("-------------------------\n");
        }

        System.out.println("Enter your choice:");

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();




        try {
            System.out.println(menu_items[Integer.parseInt(input)-1]);
        } catch (NumberFormatException e) {
            System.out.println("Make sure to enter a number as your choice!");
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Please enter a choice between 1 and " + menu_items.length);
        }

        if(input.equals("1")){
            System.out.println("Enter 1st number:");
            int n1 = Integer.parseInt(scan.nextLine());
            System.out.println("Enter 2nd number:");
            int n2 = Integer.parseInt(scan.nextLine());
            IntByReference.swapper(n1, n2);
        }

        if(input.equals("2")){
            Matrix m0 = new Matrix(Matrix.keypad());
            System.out.println("Keypad:");
            System.out.println(m0);

            Matrix m1 = new Matrix(Matrix.numbers());
            System.out.println("Numbers Systems:");
            System.out.println(m1);
        }
        if(input.equals("3")){
            System.out.println("Enter an expression to calculate:");
            String s = scan.nextLine();
            Calculator calc = new Calculator(s);
            System.out.println(calc);

        }

        if(input.equals("4")){
            //for loop to test BubbleSort
            for(int i=0; i< TIMES; i++) {
                Sorts s = new BubbleSort(SIZE);

                for(int j = 0; j<s.getData().size(); j++) {
                    // To see data, uncomment next line
//                 System.out.println(s.getData());
                    sum += s.getData().get(j);
                }
                System.out.println("Try " + i);
                System.out.println("Average random: " + sum / ((i+1)*SIZE));
                System.out.println("Nanoseconds: " + s.getTimeElapsed());
                System.out.println("Comparisons made: " + s.getComparison_counter());
                System.out.println("Swaps  made: " + s.getSwap_counter());
                System.out.println("\n");
                time += s.getTimeElapsed();
                totalswap += s.getSwap_counter();
                totalcomp += s.getComparison_counter();
            }


            System.out.println("Overall Average random: " + sum / (TIMES*SIZE));
            System.out.println("Total Nanoseconds: " + time );
            System.out.println("Total Seconds: " + time /1000000000.0);
            System.out.println("Average comparisons made: " +  totalcomp/ TIMES);
            System.out.println("Average swaps made: " +  totalswap/ TIMES);
            System.out.println("\n \n \n");
            time = 0; sum = 0; totalcomp = 0 ; totalswap = 0;

        }

        if(input.equals("5")){
            // for loop to test for InsertionSort
            for(int i=0; i< TIMES; i++) {
                Sorts s = new InsertionSort(SIZE);

                for(int j = 0; j<s.getData().size(); j++) {
                    // To see data, uncomment next line
//                 System.out.println(s.getData());
                    sum += s.getData().get(j);
                }

                System.out.println("Try " + i);
                System.out.println("Average random: " + sum / ((i+1)*SIZE));
                System.out.println("Nanoseconds: " + s.getTimeElapsed());
                System.out.println("Comparisons made: " + s.getComparison_counter());
                System.out.println("Swaps  made: " + s.getSwap_counter());
                System.out.println("\n");
                time += s.getTimeElapsed();
                totalswap += s.getSwap_counter();
                totalcomp += s.getComparison_counter();
            }


            System.out.println("Overall Average random: " + sum / (TIMES*SIZE));
            System.out.println("Total Nanoseconds: " + time );
            System.out.println("Total Seconds: " + time /1000000000.0);
            System.out.println("Average comparisons made: " +  totalcomp/ TIMES);
            System.out.println("Average swaps made: " +  totalswap/ TIMES);
            System.out.println("\n \n \n");
            time = 0; sum = 0; totalcomp = 0 ; totalswap = 0;
        }

        if(input.equals("6")){
            // for loop to test for MergeSort
            for(int i=0; i< TIMES; i++) {
                Sorts s = new MergeSort(SIZE);

                for(int j = 0; j<s.getData().size(); j++) {
                    // To see data, uncomment next line
//                 System.out.println(s.getData());
                    sum += s.getData().get(j);
                }

                System.out.println("Try " + i);
                System.out.println("Average random: " + sum / ((i+1)*SIZE));
                System.out.println("Nanoseconds: " + s.getTimeElapsed());
                System.out.println("Comparisons made: " + s.getComparison_counter());
                System.out.println("Swaps  made: " + s.getSwap_counter());
                System.out.println("\n");
                time += s.getTimeElapsed();
                totalswap += s.getSwap_counter();
                totalcomp += s.getComparison_counter();
            }


            System.out.println("Overall Average random: " + sum / (TIMES*SIZE));
            System.out.println("Total Nanoseconds: " + time );
            System.out.println("Total Seconds: " + time /1000000000.0);
            System.out.println("Average comparisons made: " +  totalcomp/ TIMES);
            System.out.println("Average swaps made: " +  totalswap/ TIMES);
            System.out.println("\n \n \n");
            time = 0; sum = 0; totalcomp = 0 ; totalswap = 0;
        }

        if(input.equals("7")){
            // for loop to test for SelectionSort
            for(int i=0; i< TIMES; i++) {
                Sorts s = new SelectionSort(SIZE);

                for(int j = 0; j<s.getData().size(); j++) {
                    // To see data, uncomment next line
//                 System.out.println(s.getData());
                    sum += s.getData().get(j);
                }

                System.out.println("Try " + i);
                System.out.println("Average random: " + sum / ((i+1)*SIZE));
                System.out.println("Nanoseconds: " + s.getTimeElapsed());
                System.out.println("Comparisons made: " + s.getComparison_counter());
                System.out.println("Swaps  made: " + s.getSwap_counter());
                System.out.println("\n");
                time += s.getTimeElapsed();
                totalswap += s.getSwap_counter();
                totalcomp += s.getComparison_counter();
            }


            System.out.println("Overall Average random: " + sum / (TIMES*SIZE));
            System.out.println("Total Nanoseconds: " + time );
            System.out.println("Total Seconds: " + time /1000000000.0);
            System.out.println("Average comparisons made: " +  totalcomp/ TIMES);
            System.out.println("Average swaps made: " +  totalswap/ TIMES);
            System.out.println("\n \n \n");
            time = 0; sum = 0; totalcomp = 0 ; totalswap = 0;
        }

        menu();


    }

    public static void main(String[] args){
        Menu.menu();
    }

}
