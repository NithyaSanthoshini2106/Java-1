public class dcba {
    public static void main(String[] args) {
        
        int[] Numbers = {101, 102, 103, 104};

        
        System.out.println("Homogeneous int[] array:");
        for (int A : Numbers) {
            System.out.println(A);
        }

        System.out.println("\nHeterogeneous Object[] array:");

        
        Object[] studentInfo = new Object[5];
        studentInfo[0] = "Nithya";      // String
        studentInfo[1] = 25;            // Integer
        studentInfo[2] = 92.5;          // Double
        studentInfo[3] = true;          // Boolean
        studentInfo[4] = 'F';           // Character

        
        for (Object info : studentInfo) {
            System.out.println(info);
        }
    }
}
