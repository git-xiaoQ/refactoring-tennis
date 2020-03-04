package cn.xpbootcamp.tennis.game1;

import cn.xpbootcamp.tennis.TennisGame;

public class TennisGame1 implements TennisGame {

    private Player player1;
    private Player player2;

    public TennisGame1(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void wonPoint(String playerName) {
        if ("player1".equals(playerName))
            player1.addScore(1);
        else
            player2.addScore(1);
    }

    public String getScore() {
        String score = "";
        int scoreOfPlayer1 = player1.getPoint();
        int scoreOfPlayer2 = player2.getPoint();

        if (isScorePointEqual(scoreOfPlayer1, scoreOfPlayer2)) {
            score = getScoreWhenPointEquel(scoreOfPlayer1);

        } else if (scoreOfPlayer1 >= 4 || scoreOfPlayer2 >= 4) {
            score = getScoreWhenOnePlayerIsWin(scoreOfPlayer1, scoreOfPlayer2);
        } else {
            score = getScoreWhenPointIsLessThanFour(score, scoreOfPlayer1, scoreOfPlayer2);
        }
        return score;
    }

    private boolean isScorePointEqual(int scoreOfPlayer1, int scoreOfPlayer2) {
        return scoreOfPlayer1 == scoreOfPlayer2;
    }

    private String getScoreWhenPointIsLessThanFour(String score, int scoreOfPlayer1, int scoreOfPlayer2) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (isScorePointEqual(i, 1)) tempScore = scoreOfPlayer1;
            else {
                score += "-";
                tempScore = scoreOfPlayer2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    private String getScoreWhenOnePlayerIsWin(int scoreOfPlayer1, int scoreOfPlayer2) {
        String score;
        int minusResult = scoreOfPlayer1 - scoreOfPlayer2;
        if (isScorePointEqual(minusResult, 1)) score = "Advantage player1";
        else if (isScorePointEqual(minusResult, -1)) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    public String getScoreWhenPointEquel(int scoreNumber){
        String score;
        switch (scoreNumber) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }
}