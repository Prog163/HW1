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
}