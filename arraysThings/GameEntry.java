package arraysThings;
//this code is refressher ahahha cause I forgor about OOP alot aahaha

public class GameEntry {
    //attributes
    protected String name;
    protected int score;

    GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String toString() {
        return "(" + name + " , " + score + " )";
    }
}
