public class Main {
    public static void main(String[] args) {

        TeamMember one = new TeamMember("One", 1, false);
        TeamMember two = new TeamMember("Two", 2, true);
        TeamMember three = new TeamMember("Three", 3, true);
        TeamMember four = new TeamMember("Four", 4, true);

        Team team = new Team("Good team", one, two, three, four);
        team.infoAboutTeamMembers();
        team.showResults();

        Obstacle swim = new Obstacle(1, "Swim");
        Obstacle run = new Obstacle(2, "Run");
        Obstacle jump = new Obstacle(3, "Jump");

        Course course = new Course(swim, run, jump);
        course.doIt(team);
    }
}