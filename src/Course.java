public class Course extends Team {
    public int swim = 40;
    public int run = 40;
    public int fight = 20;

    String[] courses = {"swim", "run", "fight"};

    public void doIt() {
        System.out.println(name + " - Приступить к прохождению препятствий!");
    }
}
