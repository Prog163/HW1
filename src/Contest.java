public class Contest extends Course{
    public static void main(String[] args) {
        Course c = new Course();
        c.doIt();

        Team team = new Team();
        team.teamPlayers();
        team.showResults();

    }
}