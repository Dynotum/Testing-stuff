package com.platzi.javatests.player;

public class Player {
    private Dice dice;
    private int minimumNumberToWin;

    public Player(Dice dice, int minimumNumberToWin) {
        this.dice = dice;
        this.minimumNumberToWin = minimumNumberToWin;
    }

    public boolean play() {
        int diceNumer = dice.roll();
        return diceNumer > minimumNumberToWin;
    }

}
