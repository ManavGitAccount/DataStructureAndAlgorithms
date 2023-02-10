package GenericsBasics.List;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    public int compare( Person left, Person right ) {

        return Integer.compare(left.getAge(), right.getAge());

    }

//    public String compareString(Person left, Person right){
//        return String.valueOf(left.getName().compareTo(right.getName()));
//    }
}
