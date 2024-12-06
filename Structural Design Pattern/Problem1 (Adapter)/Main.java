package Problem1;

public class Main {
    public static void main(String[] args) {
        Crewmate crewmate = new Crewmate();
        crewmate.responsibilities();
        Imposter imposter = new Imposter();
        imposter.sabotage();
        ImposterAdapter imposterAdapter = new ImposterAdapter(imposter);
        imposterAdapter.responsibilities();

    }
}
