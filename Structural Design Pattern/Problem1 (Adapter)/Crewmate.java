package Problem1;

public class Crewmate implements CrewmateInterface {
    public Crewmate() {
        System.out.println("There is a crew mate");
    }

    @Override
    public void responsibilities() {
        System.out.println("Crewmate is studying the interstellar objects and  doing basic maintenance tasks of the spaceship");
    }
}
