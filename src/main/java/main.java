import ru.netology.service.VacationCalcService;

public class main {

    public static void main(String[] args) {
        VacationCalcService service = new VacationCalcService();

        int vcnCount = service.calculate(100_000, 60_000, 150_000);

        System.out.println(vcnCount);
    }
}
