import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        // Create ArrayList and a class
List<Student> students = new ArrayList<>();


// Add elements to ArrayList
students.add(new Student(1,"Jack"));
students.add(new Student(2,"Joe"));
students.add(new Student(3,"Jain"));
students.add(new Student(4,"Mike"));

        // Iteration on ArrayLists
        // 1. For Loop with get(index)
        System.out.println("printing with legacy for loop --------");
        for (int i = 0; i < students.size() ; i++) {
            System.out.println(students.get(i));
        }
        // 2. Iterator
        // Forward Iteration
        System.out.println("printing with iteration---------------");

        Iterator iter = students.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        // Backwards Iteration

        // 3. for each loop


        // 4. Lambda

        // Sorting Elements in List
    }

}