package Problem1;

public class ImposterAdapter implements CrewmateInterface{
    Imposter imposter;

    public ImposterAdapter(Imposter imposter) {
        this.imposter = imposter;
        System.out.println("There is an Adapted imposter");
    }


    @Override
    public void responsibilities() {
        imposter.sabotage();
    }
}
