public class Course{
    public final Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        for (TeamMember teamMember : team.teamMembers){
            for(Obstacle obstacle : obstacles){
                if (teamMember.getPower() < obstacle.getDifficulty()){
                    System.out.println("Участник " + teamMember.getName() + " не справился с препятствием " + obstacle.getName());
                } else {
                    System.out.println("Участник " + teamMember.getName() + " справился с препятствием " + obstacle.getName());
                }
            }
        }
        System.out.println("Команда " + team.name + " молодцы!");
    }
}