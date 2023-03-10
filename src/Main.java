public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = 1.70;
        int height_in_meters = (int) index;
        int weight_in_kilorams = 60;
        int Body_Mass_Index = service.calculate(index, weight_in_kilorams);
        System.out.println(Body_Mass_Index);
    }
}