public class BmiService {
    public int calculate(double index, int weight_in_kilorams) {
        int result;
        result = (int) (weight_in_kilorams / (index * index));
        return result;
    }
}


