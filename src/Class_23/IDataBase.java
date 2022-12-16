package Class_23;
//So interfaces are like a templates that we hand out to our team members guiding them on how to build the class,
// they provide 0 implementation and dont require implementation - , but then abstract classes provide some implementation and may provide method stubs, but those methods must be implemented
public interface IDataBase {
     int age=10;
     void openDatabase();
     void readData();
     void WriteData();

} class IBM implements IDataBase{

    @Override
    public void openDatabase() {
        System.out.println(" Opening the IBM database");
    }

    @Override
    public void readData() {

        System.out.println(" Reading the data from the IBM database");
    }

    @Override
    public void WriteData() {
        System.out.println(" wring the database to IBM");
    }
}
