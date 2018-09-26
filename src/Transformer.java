import java.util.*;
import java.util.stream.Collectors;

public class Transformer {

 public static List<Person> transform(List<Person> persons){

     //mapa do zmapowania odrębnych imion i sumy wieku takich samych imion
     HashMap<String, Integer> namesAndAges = new HashMap<>();

     //lista do przechowania obiektów po "transformacji"
     List<Person> transformedPersons = new ArrayList<>();

     //petla wsadzająca imiona do setu
//     distinctNames = persons.stream().map(Person::getName).collect(Collectors.toSet());

     namesAndAges = fullFillMap(persons);

     //iteracja po mapie, tworzenie obiektów Person, i umieszczenie ich w nowej liście
     for(Map.Entry entry : namesAndAges.entrySet()){
         Person newPerson = new Person((String) entry.getKey(), (int) entry.getValue());
         transformedPersons.add(newPerson);
     }

     return transformedPersons;
 }


 public static HashMap<String, Integer> fullFillMap(List<Person> allPersons){
     //pętla wsadzająca imiona do mapy
     HashMap<String, Integer> namesAndAges = new HashMap<>();


     //pętla która uzupełnia mape wiekiem osób (sumująca wiek jesli imie juz było w mapie)
     for(Person person : allPersons){
         if(namesAndAges.get(person.getName())==null){
             namesAndAges.put(person.getName(),person.getAge() );
         }
         else{
             namesAndAges.put(person.getName(),namesAndAges.get(person.getName())+person.getAge());
         }
     }
     return namesAndAges;
 }

}
