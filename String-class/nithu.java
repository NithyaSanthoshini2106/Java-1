public class nithu {
    public static void main(String[] args) {
        // Creating strings
        String name = "Nithya raju, Kiran raju";
        String city = new String("Bangalore");

        // Printing strings
        System.out.println(name);
        System.out.println(city);

        // String methods
        System.out.println(name.toUpperCase());
        System.out.println(city.toLowerCase());
        System.out.println(name.length());
        System.out.println( name.charAt(0));
        System.out.println(name.equals("Nithya"));
        System.out.println(city.substring(0, 4));
        System.out.println(name.concat(" " + city));
        System.out.println(name.replace("ya", "u"));
    }
}
