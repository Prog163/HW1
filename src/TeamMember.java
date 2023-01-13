public class TeamMember {

    private final String name;
    private final int power;
    private final boolean obstacleCompleated;

    public TeamMember(String name, int power, boolean obstacleCompleated) {
        this.name = name;
        this.power = power;
        this.obstacleCompleated = obstacleCompleated;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public boolean getObstacleCompleated() {
        return obstacleCompleated;
    }

    @Override
    public String toString() {
        return "Name is " + name + " | power is " + power;
    }
}
