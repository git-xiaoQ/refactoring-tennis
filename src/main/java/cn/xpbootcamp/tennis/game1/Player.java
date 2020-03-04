package cn.xpbootcamp.tennis.game1;

import com.sun.javafx.logging.PulseLogger;

public class Player {
    private int score = 0;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addScore(int score) {
        this.score += score;
    }

    public String getName() {
        return name;
    }

}
