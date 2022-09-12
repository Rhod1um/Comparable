import java.util.Comparator;

public class CakeByWeight implements Comparator<Cake> {

    @Override
    public int compare(Cake cake1, Cake cake2) {
        return cake1.getWeight() - cake2.getWeight();
    }
}
