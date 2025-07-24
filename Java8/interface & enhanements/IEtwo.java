import java.util.*;
import java.util.stream.*;

interface NameOps {
    default List<String> toUpperSorted(List<String> names) {
        return names.stream()
                    .map(String::toUpperCase)
                    .sorted()
                    .collect(Collectors.toList());
    }
}

class NameService implements NameOps {}

public class IEtwo {
    public static void main(String[] args) {
        NameService svc = new NameService();
        System.out.println(
            svc.toUpperSorted(Arrays.asList("nithya", "Spoorthi", "Raju"))
        ); 
    }
}
