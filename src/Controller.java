import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<Person> allPersons = new ArrayList<>();
    private List<Person> transformedPersons = new ArrayList<>();
    private String HEADER;
    private final String[] OPTIONS = {"Add new person", "Show all persons", "Show transformed persons",
            "Exit"};

    public Controller() {
        this.HEADER = "Choose what you want to do";
    }

    public void run() {
        Integer option = 1;

        while (!(option == 4)) {
            View.displayMenu(HEADER, OPTIONS);
            option = View.getNumber("Choose option: ");
            switch (option) {
                case 1:
                    Person newPerson = PersonsController.createNewPerson();
                    allPersons.add(newPerson);
                    break;
                case 2:
                    View.printList(allPersons);
                    break;
                case 3:
                    transformedPersons = Transformer.transform(allPersons);
                    View.printList(transformedPersons);
                    break;
                case 4:
                    View.displayText("Good bye");
                    break;
            }
        }
    }
}

