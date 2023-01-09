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
            if (teamMember.getCondition() >= teamMember.getPower()){
                System.out.println("Участники прошедшие полосу препятствий: " + teamMember.getName() + "!");
            } else {
                System.out.println("Участники не прошедшие полосу препятствий: " + teamMember.getName() + "!");
            }
            System.out.println(teamMember);
        }
    }
}