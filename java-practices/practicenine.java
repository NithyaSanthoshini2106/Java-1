import java.util.LinkedList;

public class practicenine {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.addFirst("Tiger");
        animals.addLast("Elephant");
        System.out.println(animals);
        animals.removeFirst();
        animals.removeLast();
        System.out.println(animals);
        System.out.println(animals.get(1));
        System.out.println("Iterating:");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
