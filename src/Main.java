public class Main {
    public static void main(String[] args) {
        BmiService bmi = new BmiService();

        System.out.printf("Body mass index is: " + "%.2f", bmi.calculate(74, 177));
    }
}
