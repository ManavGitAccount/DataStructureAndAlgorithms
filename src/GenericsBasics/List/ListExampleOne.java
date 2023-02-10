package GenericsBasics.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExampleOne {
    private ListExampleOne(){}

    public static void main( String[] args ) {

        Person donDraper = new Person("Don Draper", 104);
        Person manavRattan = new Person("Manav Rattan", 400);
        Person kathRattan = new Person("Kathi Rattan", 100);

        List<Person> listOne = new ArrayList<>();
        listOne.add(donDraper);
        listOne.add(manavRattan);
        listOne.add(kathRattan);
        listOne.add(new Person("Arman Rattan", 500));

        Iterator<Person> iterator = listOne.iterator();
        while(iterator.hasNext()){
            Person p  = iterator.next();
            System.out.println(p);
        }


        Collections.sort(listOne, new AgeComparator());
        System.out.println(listOne);





    }
}
