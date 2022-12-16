package Class_23;

public  abstract class DataBase {
    // special software to store the data
     abstract void openDatabase();
     abstract void  readData();
     abstract  void writeData();
     abstract void closeDatabase();

}
class MicroSoftDataBase extends DataBase{
// Hover ove the error and click on the implement method option
    @Override
    void openDatabase() {
        System.out.println(" Opening the Microsoft Database");
    }

    @Override
    void readData() {
        System.out.println("reading the Data");
    }
    @Override
    void writeData() {
        System.out.println(" Opening the  data MsDatabase");
    }
    @Override
    void closeDatabase() {
        System.out.println(" closing the Microsoft Database");
    }
}   class  Oracle extends DataBase{

    @Override
    void openDatabase() {

    }

    @Override
    void readData() {

    }

    @Override
    void writeData() {

    }

    @Override
    void closeDatabase() {

    }
} class Test extends DataBase{

    @Override
    void openDatabase() {

    }

    @Override
    void readData() {

    }

    @Override
    void writeData() {

    }

    @Override
    void closeDatabase() {

    }
}
