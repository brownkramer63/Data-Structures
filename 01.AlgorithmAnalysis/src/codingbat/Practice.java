package codingbat;

public class Practice {
    public static void main(String[] args) {

    }


        public static String abbrevName(String name) {
         String[] arr=name.split(" ");

         String front=arr[0].substring(0,1);
         String back= arr[1].substring(0,1);
         String answer= front+"."+back;
         return answer.toUpperCase();

        }}

