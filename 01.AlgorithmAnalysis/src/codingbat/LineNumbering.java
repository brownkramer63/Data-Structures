package codingbat;

import java.util.ArrayList;
import java.util.List;

public class LineNumbering {
    public static void main(String[] args) {


    }
    public static List<String> number(List<String> lines){
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < lines.size()-1 ; i++) {
            answer.add(i+1+": "+lines.get(i));

        }
        return answer;
    }
}
