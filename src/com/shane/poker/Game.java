package com.shane.poker;

public class Game {
    public static void main(String[] args) {
        Poker poker = new Poker();
        int res1 = poker.match("2H 3D 5S 9C KD", "2C 3H 4S 8C AH");
        System.out.println(res1 == 1 ? "Black wins" : (res1 == -1 ? "White wins" : "Black equals White"));
        int res2 = poker.match("2H 4S 4C 2D 4H", "2S 8S AS QS 3S");
        System.out.println(res2 == 1 ? "Black wins" : (res2 == -1 ? "White wins" : "Black equals White"));
        int res3 = poker.match("2H 3D 5S 9C KD", "2C 3H 4S 8C KH");
        System.out.println(res3 == 1 ? "Black wins" : (res3 == -1 ? "White wins" : "Black equals White"));
    }

}
