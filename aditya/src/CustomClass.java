class Employee1{               //Creating the class- Employee
    int id;
    String name;

    public void myDetails(){              // Creating a method inside my class
        System.out.print("My id is "+ id);
        System.out.println(" and My name is "+ name);
    }
}

public class CustomClass {
    public static void main(String[] args) {
        Employee1 Aditya=new Employee1();              //Creating the object-new Employee
        Employee1 Berlin=new Employee1();              //Creating the object-new Employee

        Aditya.id=12;                                //Setting the attributes
        Berlin.id=13;                                //Setting the attributes
        Aditya.name="berlin";
        Berlin.name="Andres de Fonnolosa";


//        System.out.println(Aditya.id);               //Printing the attributes
//        System.out.println(Aditya.name);

        Aditya.myDetails();                            //Calling the method (more preferable than printing attributes)
        Berlin.myDetails();
    }
}
