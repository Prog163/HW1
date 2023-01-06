import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Team {
    public String name = "Good Team";

    public static int resultOne;
    public static int resultTwo;
    public static int resultThree;
    public static int resultFour;


    static String[] teams = {"playerOne", "playerTwo", "playerThree", "playerFour"};


    public static class playerOne {
        static int swim1 = 50;
        static int run1 = 40;
        static int fight1 = 30;

        public static void resultOne() {
            System.out.println(swim1 + run1 + fight1);
        }
    }

    public static class playerTwo {
        static int swim2 = 55;
        static int run2 = 40;
        static int fight2 = 30;

        public static void resultTwo() {
            System.out.println(swim2 + run2 + fight2);
        }
    }

    public static class playerThree {
        static int swim3 = 45;
        static int run3 = 45;
        static int fight3 = 30;

        public static void resultThree() {
            System.out.println(swim3 + run3 + fight3);
        }
    }

    public static class playerFour {
        static int swim4 = 35;
        static int run4 = 40;
        static int fight4 = 15;

        public static void resultFour() {
            System.out.println(swim4 + run4 + fight4);
        }
    }

    public static class FinalResults {
        static FinalResults finalResults = new FinalResults();
        public void finalResults() {
            if (resultOne >= 95 && resultTwo >= 95 && resultThree >= 95 && resultFour >= 95) {
                System.out.println("playerOne, playerTwo, playerThree, playerFour");
            } else {
                System.out.println("playerOne, playerTwo, playerThree");
            }

            public static void showResults() {
                System.out.println("Победители: " + FinalResults.finalResults);
            }

            public static void teamPlayers() {
                System.out.println("Участиники команды с именами: " + Arrays.toString(teams));
            }


//        if (finalResults <= 100) {
//            System.out.println("Победители: playerOne + playerTwo + playerThree");
//        } else if (resultOne <= 50) {
//            System.out.println("Участник не прошедший препятствия: playerFour");
//        }
//        List<String> t = new ArrayList<>(Arrays.asList(teams));
//        Collections.shuffle(t);
//        for (String s : t) {
//            System.out.println("Результаты прохождения дистанции: " + s);
//        }
        }

//    public void showResults() {
//        System.out.println("Победители: " + finalResults);
//    }


    }
}

