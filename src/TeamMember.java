public class TeamMember {

    private final String name;
    private final int power;

    private TeamMemberStatus memberStatus = TeamMemberStatus.NoPassedDistance;

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

    public TeamMemberStatus getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(TeamMemberStatus memberStatus) {
        this.memberStatus = memberStatus;
    }

    @Override
    public String toString() {
        return "Name is " + name + " | power is " + power;
    }
}
