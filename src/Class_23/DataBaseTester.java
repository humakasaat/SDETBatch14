package Class_23;

public class DataBaseTester {
    public static void main(String[] args) {
        DataBase dataBase= new MicroSoftDataBase();
        dataBase.openDatabase();
        dataBase.readData();
        dataBase.openDatabase();
        dataBase.closeDatabase();
    }
}
