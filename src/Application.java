import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args){

        Person person1 = new Person("Seba", 20);
        Person person2 = new Person("Seba", 23);
        Person person3 = new Person("Aga", 20);
        Person person4 = new Person("Aga", 20);
        Person person5 = new Person("Janusz", 20);

        Controller controller = new Controller();
        controller.run();

    }
}
