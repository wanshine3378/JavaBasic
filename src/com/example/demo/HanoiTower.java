package com.example.demo;

import java.util.*;
import static java.lang.System.out;

public class HanoiTower {
    public static void main(String[] args) {
        out.print("please enter number:");
        HanoiTower hanoi = new HanoiTower();
        int n = 3;//new Scanner(System.in).nextInt();
        for(Move move : hanoi.solve(n)) {
            out.printf("盤子from %c to %c%n", move.from, move.to);
        }
        
        
    } 
    static class Move {
        char from, to;
        Move(char from, char to) {
            this.from = from;
            this.to = to;
        }
    }
    
    List<Move> solve(int n) {
        moves = new ArrayList<Move>();
        move(n, 'A', 'B', 'C');
        return moves;
    }
    
    private List<Move> moves;
    
    private void move(int n, char a, char b, char c) {
        
        if(n == 1) {
            System.out.println("x4");
            moves.add(new Move(a,c));
        } else {
            System.out.println("x");
            move(n - 1, a, c, b);
            System.out.println("x2");
            move(1, a, b, c);
            System.out.println("x3");
            move(n -1, b, a, c);
        }
    }
    

}
