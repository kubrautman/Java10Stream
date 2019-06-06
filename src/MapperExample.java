import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapperExample {

    public static void main(String[] args) {

        List<String> names= Arrays.asList("Micheal","Lincooln","Sara","John","Sam");
        System.out.println("Impretive style:");
        for(String name:names){
            if(!name.equals("Sam")) {
                User user=new User(name);
                System.out.println(user);
            }
        }

        names.stream().filter(name-> !name.equals("Sam")).forEach(name->  System.out.println(name));
        System.out.println("Functional style:");

        names.stream().filter(MapperExample::isNotJohn).map(User::new).forEach(System.out::println);
 List<User> userlist=names.stream().filter(MapperExample::isNotJohn).map(User::new).collect(Collectors.toList());


    }
    private static  boolean isNotJohn(String name) {

        return  !name.equals("John");
    }
    static  class  User{
        private  String name;
        private int age=30;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "name : " +name + " age: "+age;
        }

        public User(String name) {
            this.name = name;
        }
    }
}

