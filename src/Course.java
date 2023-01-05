public class Course {
    public String swim;
    public String run;
    public String fight;

    String[] courses = {"swim", "run", "fight"};
    for (Course c : courses){
        c.doIt();
    }


    public void doIt() {
        System.out.println("Приступить к прохождению препятствий!");
    }
}
