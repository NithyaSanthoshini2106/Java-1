import java.util.function.Supplier;
import java.util.Random;

public class supp {
    public static void main(String[] args) {
        Supplier<String> otpSupplier = () -> {
            String digits = "0123456789";
            StringBuilder otp = new StringBuilder();
            Random rand = new Random();
            for (int i = 0; i < 6; i++) {
                otp.append(digits.charAt(rand.nextInt(10)));
            }
            return otp.toString();
        };

        System.out.println(otpSupplier.get());
    }
}
