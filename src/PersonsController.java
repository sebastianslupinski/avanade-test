public class PersonsController {

    public static Person createNewPerson(){
        Person newPerson = null;
        String name = View.getString("Please enter name: ");
        Integer age = View.getNumber("Please age of a person : ");

        newPerson = new Person(name, age);
        return newPerson;
    }
}
