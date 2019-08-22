import java.io.Console;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * Created by AHYC on 17.08.2019.
 */
public abstract class HelloWorld implements SomeInterface, AnotherInterface{
    public static void main(String[] args) {

        Set<String> strings = new LinkedHashSet<>();
        strings.add("3we");
        strings.add("2we");
        strings.add("1we");
        System.out.println(strings);
        Set<String> strings2 = new TreeSet<>();
        strings2.add("3we");
        strings2.add("2we");
        strings2.add("1we");
        System.out.println(strings2);
       Set<String> strings3 = new HashSet<>();
        strings3.add("3we");
        strings3.add("2we");
        strings3.add("1we");
        System.out.println(strings3);
        Integer x1 = 21;
        Integer x2 = 21;
        Integer x3 = 421;
        Integer x4 = 421;
        System.out.println(x1 == x2);
        System.out.println(x3 == x4);
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList.remove(2));
        System.out.println(linkedList);
    }

    @Override
    public void print() {
        System.out.println("two default methods have been implemeted");
    }

    public static final class InnerStatic{

    }
}
