import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Team {
    public String name = "Good Team";

    String[] teams = {"playerOne", "playerTwo", "playerThree", "playerFour"};

    public void showResults() {
        List<String> t = new ArrayList<>(Arrays.asList(teams));
        Collections.shuffle(t);
        for (String s : t) {
            System.out.println("Результаты прохождения дистанции: " + s);
        }
    }

    public void teamPlayers() {
        System.out.println("Участиники коменды с именами: " + Arrays.toString(teams));
    }

}
