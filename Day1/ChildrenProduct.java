package HomeWork.Day1;
//4. Детские товары:
//4.1 Минимальный возраст
//4.2 Гипоаллергенность
public class ChildrenProduct extends Product {
    private int minAge;
    private String gippoAlergic;
    public ChildrenProduct(String name, double price, int quantity, String unit, int minAge, String gippoAlergic) {
        super(name, price, quantity, unit);
        this.minAge = minAge;
        this.gippoAlergic = gippoAlergic;
    }

    @Override
    public String toString() {
        return super.toString()+"\n" +
                "минимальный возраст: " + minAge + "\n"+
                "гиппоаллергенность: " + gippoAlergic;
    }
}
