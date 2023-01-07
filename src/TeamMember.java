public class TeamMember {

    private final String name;
    private final int power;

    public TeamMember(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name is " + name + " | power is " + power;
    }
}
