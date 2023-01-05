import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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


    public void showResults() {
        List<String> t = new ArrayList<>(Arrays.asList(teams));
        Collections.shuffle(t);
        for (String s : t) {
            System.out.println("Результаты прохождения дистанции: " + s);
        }
    }

}
