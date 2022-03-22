package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> make_pegboard() {
        ArrayList<Integer> pegboard = new ArrayList<Integer>();
        int N = 10;

        for(int i = 1; i < N+1; i++) {
            pegboard.add(i);
        }

        return pegboard;
    }

    public static void print_pegboard(ArrayList<Integer> pegboard) {
        String pegs = "";
        for(int i : pegboard) {
            pegs += "(" + i + ") ";
        }

        System.out.println("----------------------------------------");
        System.out.println(pegs);
        System.out.println("----------------------------------------");
    }

    public static void peg_hole(ArrayList<Integer> pegboard) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick a hole: ");
        int hole = Integer.parseInt(sc.nextLine());
        hole -= 1;

        while(hole < 0 || hole > 9 || pegboard.get(hole) == 0) {
            System.out.println("Pick a different hole: ");
            hole = Integer.parseInt(sc.nextLine());
            hole -= 1;
        }

        pegboard.set(hole, 0);
    }

    public static void main(String[] args) {
        ArrayList<Integer> pegboard = make_pegboard();
        print_pegboard(pegboard);
        for (int i = 0; i < 10; i++) {
            peg_hole(pegboard);
            print_pegboard(pegboard);
        }
    }

}