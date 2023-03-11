public class BmiService {
    public int calculate(double index, int weightInKilorams) {
        int result;
        result = (int) (weightInKilorams / (index * index));
        return result;
    }
}


