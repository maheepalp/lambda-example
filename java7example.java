import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class java7example {
    
    public static void main(String [] args){
        List<Person> people = Arrays.asList(
            new Person("mahepal", "pullakhandam"),
            new Person("some", "one"),
            new Person("aaaa", "aaaa"),
            new Person("zzzz", "zzzz")

        );

        // STEP1 - SORTED ALL
        Collections.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }

        });

        // STEP2 - PRINT ALL
        System.out.println("PRINT ALL");
        printAll(people);

        //STEP3 - PRINT WHOSE FIRSRT NAME STARTS WITH M
        System.out.println("PRINT WHOSE FIRSRT NAME STARTS WITH M");
        printWithCondition(people, new Condition7() {

            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("m");
            }
            
        });

    }

    private static void printWithCondition(List<Person> people, Condition7 condition) {
        for(Person p : people){
            if(condition.test(p)){
                System.out.println(p.getFirstName() +"," +p.getLastName());
            }

        }
    }

    private static void printAll(List<Person> people) {
        
        for(Person p : people){
            System.out.println(p.getFirstName() +"," +p.getLastName());
        }
    }

}

interface Condition7{
    public boolean test(Person p);
}


