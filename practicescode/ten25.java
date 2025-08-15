


public class ten25 {
    public static void main(String[] args) {

        int x = 10, y = 20;
        if (x > y) {
            System.out.println("x is greater");
        } else {
            System.out.println("y is greater");
        }
        int marks = 75;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Invalid day");
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        int count = 1;
        while (count <= 3) {
            System.out.println(count);
            count++;
        }
        int num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num <= 3);
        for (int i = 1; i <= 5; i++) {
            if (i == 3) break;
            System.out.println(i);
        }
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;
            System.out.println(i);
        }
    }
}
