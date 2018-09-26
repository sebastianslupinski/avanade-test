import java.util.*;

public class Transformer {

 public static List<Person> transform(List<Person> persons){
     //stworzenia setu imion który nie przyjmuje powtarzających imion
     Set<String> distinctNames = new HashSet<>();

     //mapa do zmapowania odrębnych imion i sumy wieku takich samych imion
     HashMap<String, Integer> namesAndAges = new HashMap<>();

     //lista do przechowania obiektów po "transformacji"
     List<Person> transformedPersons = new ArrayList<>();

     //petla wsadzająca imiona do setu
     for(Person person : persons){
         distinctNames.add(person.getName());
     }

     namesAndAges = fullFillMap(persons,distinctNames );

     //iteracja po mapie, tworzenie obiektów Person, i umieszczenie ich w nowej liście
     for(Map.Entry entry : namesAndAges.entrySet()){
         Person newPerson = new Person((String) entry.getKey(), (int) entry.getValue());
         transformedPersons.add(newPerson);
     }

     return transformedPersons;
 }


 public static HashMap<String, Integer> fullFillMap(List<Person> allPersons, Set<String> distinctNames){
     //pętla wsadzająca imiona do mapy
     HashMap<String, Integer> namesAndAges = new HashMap<>();

     for(String name : distinctNames){
         namesAndAges.put(name, null);
     }

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
