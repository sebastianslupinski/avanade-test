import java.util.*;

public class Transformer {

 public static List<Person> transform(List<Person> persons){
     Set<String> distinctNames = new HashSet<>();
     HashMap<String, Integer> namesAndAges = new HashMap<>();
     List<Person> transformedPersons = new ArrayList<>();

     for(Person person : persons){
         distinctNames.add(person.getName());
     }

     for(String name : distinctNames){
         namesAndAges.put(name, null);
     }

     for(Person person : persons){
         if(namesAndAges.get(person.getName())==null){
             namesAndAges.put(person.getName(),person.getAge() );
         }
         else{
             namesAndAges.put(person.getName(),namesAndAges.get(person.getName())+person.getAge());
         }
     }

     for(Map.Entry entry : namesAndAges.entrySet()){
         Person newPerson = new Person((String) entry.getKey(), (int) entry.getValue());
         transformedPersons.add(newPerson);
     }

     return transformedPersons;

 }

 public static void printList(List<Person> persons){
     for(Person person : persons){
         System.out.println(person.toString());
     }
 }
}
