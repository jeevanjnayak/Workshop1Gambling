package com.Bridgelabz;

public class Gambling {
    public static final int BET_PER_GAME = 1;
    public static final int STAKE_PER_DAY = 100;

    public static void main(String[] args) {
        int stakePerDay = 100;
        int winnings = 0;
        int totalWinning = 0;
        while (winnings > -(stakePerDay)) {
            if (winnings < 100){
                byte betResult = (byte) (Math.floor(Math.random() * 10) % 2);
                if (betResult == 1) {
                    winnings += 1;
                    totalWinning = winnings;
                }
                else {
                    winnings -= 1;
                    totalWinning = winnings;
                }
            }
            else
                winnings = -(stakePerDay);

        }
        System.out.println(totalWinning);

    }

}
