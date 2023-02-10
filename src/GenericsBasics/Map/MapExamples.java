package GenericsBasics.Map;

import GenericsBasics.List.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {

    private MapExamples(){}

    public static void main( String[] args ) {

        Person donP = new Person("Manav Rattan", 789);
        Person peggyP = new Person("Arman Rattan", 906);
        Person gooseP = new Person("Kathi Rattan", 290);

        Map<Integer, Person> personsMap = new HashMap<>();
        personsMap.put(donP.getAge(), donP);
        personsMap.put(peggyP.getAge(), peggyP);
        personsMap.put(gooseP.getAge(), gooseP);

        System.out.println(personsMap);
        System.out.println(personsMap.get(789));

        for(Integer intA : personsMap.keySet()){
            System.out.println(intA);
        }

        for(Person p : personsMap.values()){
            System.out.println(p);
        }

        for(Map.Entry<Integer, Person> entry : personsMap.entrySet()){
            System.out.println(entry);
            System.out.println("------------------------");
            System.out.println(entry.getKey());
            System.out.println("------------------------");
            System.out.println(entry.getValue());
        }
    }
}
