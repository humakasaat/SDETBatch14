package Class16;

class HW_ReturnVowelsFromString {
    private String vowels(String str){

        String vowels= str.replaceAll("[^aeoui]","");
        return vowels;
    }

    public static void main(String[] args) {
        HW_ReturnVowelsFromString obj= new HW_ReturnVowelsFromString();
        System.out.println(obj.vowels("Huma Kasaat"));
        System.out.println(obj.vowels("Emaddudin Kasaat"));
    }
}
