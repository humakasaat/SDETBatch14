package Class14;

import java.util.Arrays;

public class StringRecap {
    public static void main(String[] args) {
        String str="kjfksfAJDSKJD274362374!@##$";
        str= str.replaceAll("[^a-z A-Z]","");
        System.out.println("str = " + str);
        String sentence=" BAtch 14 is Great. batch 14 is excellent? Batch 14 is just amazing";

        String[] split = sentence.split("[.,?]");// alt+ enter create variable automatically
        System.out.println("split="+ Arrays.toString(split));
        boolean isTrue=false;
    }
    }

