public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.70;
        int weightInKilorams = 60;
        int Body_Mass_Index = service.calculate(heightInMeters, weightInKilorams);
        System.out.println(Body_Mass_Index);
    }
}