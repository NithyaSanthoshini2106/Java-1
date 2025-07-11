import java.util.function.Supplier;
import java.util.Random;

public class twonithya {
    public static void main(String[] args) {
        Supplier<String> s1 = () -> {
            String digits = "0123456789";
            StringBuilder otp = new StringBuilder();
            Random rand = new Random();

            for (int i = 0; i < 6; i++) {
                int index = rand.nextInt(10); 
                otp.append(digits.charAt(index));
            }

            return otp.toString();
        };

        System.out.println(s1.get());
    }
}
