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
        System.out.println("backward iteration---------------");
        //idk how to do


        // 3. for each loop
        System.out.println("for each loop------------");
        for (Student each:students
             ) {
            System.out.println(each);
        }

        // 4. Lambda
        System.out.println("lambda----------------");

     students.forEach(student -> System.out.println(student));

        // Sorting Elements in List using comparator interface
        System.out.println("elements in a list using comparator by ID descending---------");

        //implementations of comparator
        Collections.sort(students,new sortbyIDDescending());
        students.forEach(student -> System.out.println(student));


    }
static class sortbyIDDescending implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.id-o1.id;
    }
}
}