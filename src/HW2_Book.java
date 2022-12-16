public class HW2_Book {
    //Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed
    String bookName;
    String authorName;
    int numberOfPages;
    int numberOfChapters;

  public  HW2_Book( String bookName, String authorName){
    this. bookName= bookName;
    this.authorName=authorName;
      System.out.println("Name of the book is "+ bookName+ " and author is " + authorName);
  } public HW2_Book( int numberOfPages, int numberOfChapters){
      this.numberOfPages=numberOfPages;
      this.numberOfChapters=numberOfChapters;
        System.out.println(" it has " + numberOfPages+" pages"+ " and " + numberOfChapters+ " chapters");
    }

    public static void main(String[] args) {
       HW2_Book obj= new HW2_Book("Java","Ahmad");
       HW2_Book objs= new HW2_Book(100,3);
        ;

    }
}