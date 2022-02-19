package com.company;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import static java.lang.Math.random;
public class Main {

    static void Task1 () {

        int S = 0;
        int start = 0;
        int end = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть розмірність масиву: ");
        int size = in.nextInt();
        int mas[] = new int[size];
        for (int i = 0; i < size; i++) {
            mas[i] = (int) ((Math.random() * 40) - 20);
            System.out.print(mas[i] + "  ");
        }
        List<Integer> odd = new ArrayList<Integer>();
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                odd.add(mas[i]);
            }
        }
        for (int i = 0; i < odd.size(); i++) {
            S += odd.get(i);
        }
        System.out.println(" ");
        System.out.println("Сума елементів з непарними індексами: " + S);
        for (int i = 0; i < size; i++) {
            if (mas[i] < 0){
                end = i;
            }
        }
        for (int i = 0; i < size; i++) {
            if (mas[i] < 0){
                start = i;
                break;
            }
        }
       int count = end - start - 1;
       // for (int i = 0; i < size; i++) {
          //  if (mas[i] < 0) {
               // for (start = i; start < end; start++) {
                 //   Sum = i++;
              //  }
             //  break;
          //  }
       // }
        System.out.println("Кількість елементів, що розташовані між першим і останнім від’ємними елементами: " + count);
    }

    static void Task2 () {

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть розмірність масиву: ");
        int size = in.nextInt();
        Integer array[] = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) ((Math.random() * 41) - 20);
            System.out.print(array[i] + "  ");
        }
        System.out.println( "  ");
        Arrays.sort(array, Collections.reverseOrder());
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + "  ");
            }
        System.out.println( "  ");

        }


    static void Task3 () {

        int ind = 0;
        int index = 1;
        int max_c = 0;
        int S = 0;
        int rows = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть розмірність матриці: ");
        int n = in.nextInt();
        int m = in.nextInt();
        int Matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Matrix[i][j] = (int) ((Math.random() * 100) - 30);
                System.out.print("\t" + Matrix[i][j] + "\t");
            }
            System.out.println("\t");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (Matrix[i][j] < 0) {
                    rows++;
                    break;
                }
            }
        }
        System.out.println("Кількість рядків, що містять хоча б один від’ємний елемент: " + rows);

        //HashSet<Integer> input = new HashSet<>();
        //HashSet<Integer> output = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                for (int t = 0; t < m; t++) {
                    if (t == j) {
                        continue;
                    }
                    else if (Matrix[i][j] == Matrix[i][t]) {
                        ++count;
                        ++i;
                        break;
                    }
                }
            }
            if (count > max_c) {

                max_c = count;
                index = i;
                ind = i;
            }
        }
        if (ind == 0) {
            System.out.println("Немає рядків з серією однакових елементів! ");
        }
        else {
            System.out.println("Номер рядка з найкоротшою серією однакових елементів: " + index);
        }
    }

    static void Task4 () {
        System.out.println("Квадратна матриця: ");
        System.out.println();
        int N = 11;
        int Matrix[][] = new int [N][N];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if(i+j+1<N) {
                    Matrix[i][j] = 0;
                }
                else if (i < j){
                 Matrix[i][j] = 0;
                }
                else {
                    Matrix[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print( Matrix[i][j] );
            }
            System.out.println("\t");
        }
    }

    public static void main(String[] args) {
        System.out.println("Task1:");
        Task1 ();
        System.out.println(" ");
        System.out.println("Task2:");
        Task2 ();
        System.out.println(" ");
        System.out.println("Task3:");
        Task3 ();
        System.out.println(" ");
        System.out.println("Task4:");
        Task4 ();
    }
}