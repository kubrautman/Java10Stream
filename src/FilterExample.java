import java.util.Arrays;
import java.util.List;

public class FilterExample {

    public static void main(String[] args) {

        List<String> names= Arrays.asList("Micheal","Lincooln","Sara","John","Sam");
        for(String name:names){
            if(!name.equals("Sam")) {
                System.out.println(name);
            }
        }

        names.stream().filter(name-> !name.equals("Sam")).forEach(name->  System.out.println(name));
        System.out.println("***************************");

        names.stream().filter(name-> isNotThisName("Kübra")).forEach(System.out::println);



    }
    private static  boolean isNotThisName(String name) {

     return  !name.equals(name);
    }
}
