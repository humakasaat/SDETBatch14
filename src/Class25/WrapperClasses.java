package Class25;

public class WrapperClasses {
    public static void main(String[] args) {
        int num=10;
        Integer wrappedNum= num;
        System.out.println(num);
        int pnum=20;
        Integer wnum=pnum;
        System.out.println(pnum);
        int pnum1= wnum.intValue();
        System.out.println(pnum1);


    }


}
