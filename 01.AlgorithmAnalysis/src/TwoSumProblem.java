import java.util.Arrays;

public class TwoSumProblem {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5,6,3};

        System.out.println(Arrays.toString(twosum(arr,6)));



    }
    public static int[] twosum(int[] arr,int sumwanted){

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j < arr.length ; j++) {
                if (arr[i]+arr[j]==sumwanted){
                   return new int[]{ i,j};
                }

            }

        }


return new int[]{};
    }
}
