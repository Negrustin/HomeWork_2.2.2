public class BmiService {
    public double calculate(double bodyWeightKg, double heightCm) {
        double bmi;
        bmi = bodyWeightKg / (heightCm / 100 * heightCm / 100);
        return bmi;
    }
}
