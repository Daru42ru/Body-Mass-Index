public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = 1.70;
        int heightInMeters = (int) index;
        int weightInKilorams = 60;
        int Body_Mass_Index = service.calculate(index, weightInKilorams);
        System.out.println(Body_Mass_Index);
    }
}