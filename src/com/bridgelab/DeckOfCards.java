package com.bridgelab;

public class DeckOfCards {
    //main method
    public static void main(String[] args){
       // System.out.println("Welcome to Decks of Cards problem");
        //creating object
        Cards card = new Cards();
        //for loop is using to count player numbers
        for(int player_count =1;player_count<=4;player_count++){
            //methods calling through object
            card.CardCount(player_count);
            System.out.println("player number"+player_count);
        }
    }
}
