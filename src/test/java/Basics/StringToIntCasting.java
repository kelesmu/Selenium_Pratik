package Basics;

public class StringToIntCasting {

    /*
    //String to integer
    Integer.parseInt(String)
     */
    public static void main(String[] args) {
        String a="545";
        String b="654";

        int valueA= Integer.parseInt(a);
        int valueB=Integer.parseInt(b);
        int sum=valueA+valueB;
        System.out.println(sum);

    }
}
