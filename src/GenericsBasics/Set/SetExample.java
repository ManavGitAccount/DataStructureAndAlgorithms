package GenericsBasics.Set;

import GenericsBasics.List.Person;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    private SetExample(){}

    public static void main( String[] args ) {

        Person p1 = new Person("Donny Draper", 104);
        Person p2 = new Person("Jonny Bravo", 144);

        Set<Person> setOne = new HashSet<>();
        setOne.add(p1);
        setOne.add(p2);

        System.out.println(setOne.contains(p1));

        for(Object p : setOne){
            System.out.println(p);
        }

    }
}
