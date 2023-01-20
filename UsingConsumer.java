import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UsingConsumer {

    
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
        printWithCondition(people, p -> true, p -> System.out.println(p.getFirstName()));

        //STEP3 - PRINT WHOSE FIRSRT NAME STARTS WITH M
        System.out.println("PRINT WHOSE FIRSRT NAME STARTS WITH M");
        printWithCondition(people, p -> p.getFirstName().startsWith("m"), p -> System.out.println(p.getFirstName() + p.getLastName()));

    }

    private static void printWithCondition(List<Person> people, Predicate<Person> Predicate, Consumer<Person> consumer) {
        for(Person p : people){
            if(Predicate.test(p)){
                consumer.accept(p);
            }

        }
    }
    
}
