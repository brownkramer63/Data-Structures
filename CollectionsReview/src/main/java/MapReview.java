import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {
//create hash map

        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(1,"kramer");
        studentsMap.put(2,"kay");
        studentsMap.put(11,"mary");
        studentsMap.put(12,"polly");

        String str = "Java Developer";

        System.out.println(findFirstNonRepeating(str));

    }
    public static Character findFirstNonRepeating(String str){

        //create a hashmap this will cost me space complexity

        //count frequency of chars

        //start from the beginning and check if there is a char with frequnecy 1

        Map<Character,Integer> map = new HashMap<>();
        int count;
        for (Character each:str.toCharArray()
             ) {
            if ((map.containsKey(each))){
                count=map.get(each);
                map.put(each,count+1);
            }
            else map.put(each,1);
        }
        for (Character each: str.toCharArray()
             ) {
            if (map.get(each)==1){
                return each;
            }
        }
        return null;
    }
}
