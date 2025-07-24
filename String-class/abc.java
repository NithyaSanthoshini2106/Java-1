public class abc {

    public static void main(String[] args) {
        try {

            int i = Integer.parseInt(args[0]);
        }catch (NumberFormatException e) {

            System.err.println(e.getMessage());
            System.out.println("Nithya ");
        }
        System.out.println();
    }
    
}
