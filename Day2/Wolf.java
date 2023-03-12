package HomeWork.Day2;

public class Wolf extends WildAnimal{
    private String leader;
    public Wolf(int height, int weight, String eyeCollor, String habitat, String dateLocation, String leader) {
        super(height, weight, eyeCollor, habitat, dateLocation);
        this.leader = leader;
    }
    @Override
    void song() {
        System.out.println("Auuuuuu, Auuuuu, Auuuuuuuu");
    }

    public String getLeader() {
        return leader;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Лидер стаи = " + leader;
    }
}
