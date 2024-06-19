import controller.ComplexCalculatorController;
import model.ComplexNumber;
import service.ComplexNumberService;
import service.ComplexNumberServiceImpl;

public class Application {
    public static void run() {
        ComplexNumberService service = new ComplexNumberServiceImpl();
        ComplexCalculatorController controller = new ComplexCalculatorController(service);

        ComplexNumber a = new ComplexNumber(2, 3);
        ComplexNumber b = new ComplexNumber(1, 1);

        controller.add(a, b);
        controller.multiply(a, b);
        try {
            controller.divide(a, b);
        } catch (ArithmeticException e) {
            System.err.println("Исключение: " + e.getMessage());
        }
    }
}
