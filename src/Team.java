public class Team {
    public String name;
    public String playerOne;
    public String playerTwo;
    public String playerThree;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    String[] teams = {"playerOne", "playerTwo", "playerThree"};
    for (Team team : teams){
        team.showResults();
    }


    public void showResults() {
        System.out.println();
    }

}
