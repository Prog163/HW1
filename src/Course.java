import java.util.ArrayList;

public class Course {
    public final Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        ArrayList<TeamMember> membersWhoCompleted = new ArrayList<>();
        ArrayList<TeamMember> membersWhoNotCompleted = new ArrayList<>();

        for (TeamMember teamMember : team.teamMembers) {
            for (Obstacle obstacle : obstacles) {
                if (teamMember.getPower() < obstacle.getDifficulty()) {
                    System.out.println("Участник " + teamMember.getName() + " не справился с препятствием " + obstacle.getName());
                    membersWhoNotCompleted.add(teamMember);
                } else {
                    System.out.println("Участник " + teamMember.getName() + " справился с препятствием " + obstacle.getName());
                    membersWhoCompleted.add(teamMember);
                }
            }
        }

        membersWhoCompleted.removeAll(membersWhoNotCompleted);
        for (TeamMember teamMember : membersWhoCompleted)
            teamMember.setMemberStatus(TeamMemberStatus.PassedDistance);

        System.out.println("Команда " + team.name + " молодцы!");
    }


}