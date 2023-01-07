public class Obstacle {
    private final int difficulty;
    private final String name;

    public Obstacle(int difficulty, String name) {
        this.difficulty = difficulty;
        this.name = name;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public String getName() {
        return name;
    }
}
