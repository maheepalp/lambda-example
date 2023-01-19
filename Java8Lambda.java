import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java8Lambda {
    
    public static void main(String [] args){
        List<Person> people = Arrays.asList(
            new Person("mahepal", "pullakhandam"),
            new Person("some", "one"),
            new Person("aaaa", "aaaa"),
            new Person("zzzz", "zzzz")

        );

        // STEP1 - SORTED ALL
        Collections.sort(people, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));

        // STEP2 - PRINT ALL
        System.out.println("PRINT ALL");
        printWithCondition(people, p -> true);

        //STEP3 - PRINT WHOSE FIRSRT NAME STARTS WITH M
        System.out.println("PRINT WHOSE FIRSRT NAME STARTS WITH M");
        printWithCondition(people, p -> p.getFirstName().startsWith("m"));

    }

    private static void printWithCondition(List<Person> people, Condition8 condition) {
        for(Person p : people){
            if(condition.test(p)){
                System.out.println(p.getFirstName() +"," +p.getLastName());
            }

        }
    }
}

interface Condition8{
    public boolean test(Person p);
}



