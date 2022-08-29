package codingbat;

public class countHi {
    public static void main(String[] args) {
        System.out.println(countHi("hihi"));

    }
    public static int countHi(String str) {
        int count =0;
        for(int i=0; i<str.length()-1; i++){
            String ss=str.substring(i,i+2);

            if(ss.equals("hi")){
                count++;
            }
        }
        return count;
    }
}
