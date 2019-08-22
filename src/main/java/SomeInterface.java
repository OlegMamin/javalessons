/**
 * Created by AHYC on 17.08.2019.
 */
public interface SomeInterface {
    default void print(){
        System.out.println("static method");
    }
}
