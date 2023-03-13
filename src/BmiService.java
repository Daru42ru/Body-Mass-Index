public class BmiService {
    public int calculate(double heightInMeters, int weightInKilorams) {
        int result;
        result = (int) (weightInKilorams / Math.pow(heightInMeters, 2));
        return result;
    }
}


