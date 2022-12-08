/*Project 9
Q.A data analyst organization wishes to maintain data and do statistical analysis on it. Design a
data structure for  the organization where the data size is unknown such that the following
operations on the data can be computed efficiently.
DOD1. Stores the data according to requirements such as arraylist .
Dod 2. Implement the code for producing various statistical mean, median, mode, standard
deviation.
Dod3. Return all the calculated data. */

import Data_Analysis.linkedlist.*;
import java.util.*;

public class main_class{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // CREATING LINKEDLIST
        Linked_List list=new Linked_List();

        System.out.println("--- WELCOME TO DATA ANALYSIS SYSTEM ---");
        System.out.println();

        while(true){
            System.out.println("1.ADD DATA");
            System.out.println("2.PRINT DATA");
            System.out.println("3.CALCULATE MEAN , MEDIAN , MODE & STANDARD DEVIATION ");
            System.out.println("4.FOR EXITING");
            System.out.println();

            System.out.print("ENTER INPUT : ");
            int input=sc.nextInt();

            if(input==1){
                // ADD DATA
                System.out.print("ENTER DATA TO STORE : ");
                int data=sc.nextInt();
                list.Add_data(data);
                System.out.println("DATA ADDED !!");
                System.out.println();
            }
            else if(input==2){
                //PRINT DATA
                list.print();
            }
            else if(input==3){
                // CALCULATE MEAN
                list.mean();
                //CALCULATE MEDIAN
                list.median();
                // CALCULATE MODE
                list.mode();
                // CALCULATE STANDARD DEVIATION
                list.standard_deviation();
            }
            else if(input==4){
                System.out.println("THANKS FOR USING OUR SERVICES :) ");
                System.out.println();
                break;
            }
        }
        sc.close();
    }
}