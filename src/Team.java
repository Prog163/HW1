public class Team {

    public final String name;

    public final TeamMember[] teamMembers;

    public Team(String name, TeamMember... teamMembers) {
        this.name = name;
        this.teamMembers = teamMembers;
    }

    public void infoAboutTeamMembers() {
        for (TeamMember teamMember : teamMembers) {
            System.out.println(teamMember);
        }
    }

    public void showResults() {
        for (TeamMember teamMember : teamMembers) {
            if (TeamMemberStatus.PassedDistance.equals(teamMember.getMemberStatus())) {
                System.out.println("Участник: " + teamMember.getName() + " прошел полосу препятствий!");
            } else {
                System.out.println("Участник: " + teamMember.getName() + " не прошел полосу препятствий!");
            }
            System.out.println(teamMember);
        }
    }
}