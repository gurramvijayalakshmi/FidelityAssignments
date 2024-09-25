package AssesmentCoding;



public class EmployeePayRoll {
    public static void main(String[] args) {

        PermanentEmployee emp1= new PermanentEmployee(101,"Esther",25000,1500);

        System.out.println("Permanent Employee Details : " );
        emp1.DisplayDetails();

        System.out.println();


        TemporaryEmployee emp2=new TemporaryEmployee(102,"Ganesh",1500,20);

        System.out.println("Temporary Employee Details : " );
        emp2.DisplayDetails();
    }

}
