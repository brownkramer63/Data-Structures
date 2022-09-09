package Demos;

import java.util.ArrayList;
import java.util.Arrays;

public class BusQ {

    public static void main(String[] args) {

        ArrayList<int[]> listofpeople= new ArrayList<>();

        listofpeople.add(new int[] {10,0});
        listofpeople.add(new int[] {10,4});
        listofpeople.add(new int[] {11,10});

        for (int[] each:listofpeople
             ) {
            System.out.println(Arrays.toString(each));
        }

        System.out.println(BusQ(listofpeople));

    }
    public static int BusQ(ArrayList<int[]> bus){
        int answer=0;
        for (int i = 0; i <bus.size() ; i++) {

            answer=answer+bus.get(i)[0]- bus.get(i)[1];

        }
        return answer;
    }
}
