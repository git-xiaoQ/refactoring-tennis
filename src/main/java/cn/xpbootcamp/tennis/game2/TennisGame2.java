package cn.xpbootcamp.tennis.game2;

import cn.xpbootcamp.tennis.TennisGame;
import cn.xpbootcamp.tennis.game1.Player;

public class TennisGame2 implements TennisGame {

    public String P1res = "";
    public String P2res = "";

    private Player player1;
    private Player player2;

    public TennisGame2(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getScore() {
        String score = "";
        int socreOfPlayer1 = player1.getPoint();
        int socreOfPlayer2 = player2.getPoint();

        if (socreOfPlayer1 == socreOfPlayer2 && socreOfPlayer1 < 4) {
            if (socreOfPlayer1 == 0)
                score = "Love";
            if (socreOfPlayer1 == 1)
                score = "Fifteen";
            if (socreOfPlayer1 == 2)
                score = "Thirty";
            score += "-All";
        }
        if (socreOfPlayer1 == socreOfPlayer2 && socreOfPlayer1 >= 3)
            score = "Deuce";

        if (socreOfPlayer1 > 0 && socreOfPlayer2 == 0) {
            if (socreOfPlayer1 == 1)
                P1res = "Fifteen";
            if (socreOfPlayer1 == 2)
                P1res = "Thirty";
            if (socreOfPlayer1 == 3)
                P1res = "Forty";

            P2res = "Love";
            score = P1res + "-" + P2res;
        }
        if (socreOfPlayer2 > 0 && socreOfPlayer1 == 0) {
            if (socreOfPlayer2 == 1)
                P2res = "Fifteen";
            if (socreOfPlayer2 == 2)
                P2res = "Thirty";
            if (socreOfPlayer2 == 3)
                P2res = "Forty";

            P1res = "Love";
            score = P1res + "-" + P2res;
        }

        if (socreOfPlayer1 > socreOfPlayer2 && socreOfPlayer1 < 4) {
            if (socreOfPlayer1 == 2)
                P1res = "Thirty";
            if (socreOfPlayer1 == 3)
                P1res = "Forty";
            if (socreOfPlayer2 == 1)
                P2res = "Fifteen";
            if (socreOfPlayer2 == 2)
                P2res = "Thirty";
            score = P1res + "-" + P2res;
        }
        if (socreOfPlayer2 > socreOfPlayer1 && socreOfPlayer2 < 4) {
            if (socreOfPlayer2 == 2)
                P2res = "Thirty";
            if (socreOfPlayer2 == 3)
                P2res = "Forty";
            if (socreOfPlayer1 == 1)
                P1res = "Fifteen";
            if (socreOfPlayer1 == 2)
                P1res = "Thirty";
            score = P1res + "-" + P2res;
        }

        if (socreOfPlayer1 > socreOfPlayer2 && socreOfPlayer2 >= 3) {
            score = "Advantage player1";
        }

        if (socreOfPlayer2 > socreOfPlayer1 && socreOfPlayer1 >= 3) {
            score = "Advantage player2";
        }

        if (socreOfPlayer1 >= 4 && socreOfPlayer2 >= 0 && (socreOfPlayer1 - socreOfPlayer2) >= 2) {
            score = "Win for player1";
        }
        if (socreOfPlayer2 >= 4 && socreOfPlayer1 >= 0 && (socreOfPlayer2 - socreOfPlayer1) >= 2) {
            score = "Win for player2";
        }
        return score;
    }

    public void setScore(int number, Player player) {

        for (int i = 0; i < number; i++) {
            player.addScore(1);
        }
    }

    public void wonPoint(String player) {
        if ("player1".equals(player))
            player1.addScore(1);
        else
            player2.addScore(1);
    }
}