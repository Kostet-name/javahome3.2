public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        //weight = Ваш вес в кг
        //height = Ваш рост в м
        double index = service.calculate(85,1.96);
        int bmi = (int)index;
        System.out.println("Ваш индекс массы тела= " + bmi);

    }
}