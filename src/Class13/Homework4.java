package Class13;

public class Homework4 {
    public static void main(String[] Huma) {
        //How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
        String a = "his is sentence i want to reverse";
        String[] arr = a.split(" ");
        for (int k = 0; k < arr.length; k++) {
            for (int m = arr[k].length() - 1; m >= 0; m--) {
                System.out.print(arr[k].charAt(m));
            }
            System.out.print(" ");
        }

    }
}
