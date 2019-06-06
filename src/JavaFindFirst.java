

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class JavaFindFirst {


    public static void main(String[] args) {
        List<String> names= Arrays.asList("Micheal","Lincooln","Sara","John","Sam");
       String result = names.stream().filter(n-> n.equals("Sara")).findFirst().orElse(null);
       System.out.println(result);
    }
}
