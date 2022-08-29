import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;

public class SetReview {
    public static void main(String[] args) {
        //1. create a set

        Set<Student> set = new LinkedHashSet<>();

        set.add(new Student(1,"Jack"));
        set.add(new Student(2,"Joe"));
        set.add(new Student(3,"Jain"));
        set.add(new Student(4,"Mike"));

        System.out.println(set);

        System.out.println(firstRepeatingChar("Java Developer"));

        // 2 add element



    }
    public static Character firstRepeatingChar(String str){
        //create a hashset
        //iterate over the char array and add chars into hashset
        //if add ops is false return that charge
        Set<Character> chars = new HashSet<>();

        for (Character ch: str.toCharArray()
             ) {
            if (!chars.add(ch)) return ch;
        }
        return null;
    }
}
