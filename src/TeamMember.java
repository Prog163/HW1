public class TeamMember {

    private final String name;
    private final int power;
    private final int condition;

    public TeamMember(String name, int power, int condition) {
        this.name = name;
        this.power = power;
        this.condition = condition;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public int getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "Name is " + name + " | power is " + power;
    }
}
