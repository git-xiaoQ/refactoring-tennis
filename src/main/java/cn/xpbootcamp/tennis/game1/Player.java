package cn.xpbootcamp.tennis.game1;

public class Player {
    private int point = 0;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void addScore(int score) {
        this.point += score;
    }

    public String getName() {
        return name;
    }

}
