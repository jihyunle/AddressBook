//import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
//
//        Random random = new Random();

        AddressBook ab = new AddressBook();

        // no arg constructor
        Car c1 = new Car();
        c1.setModel("mercedes benz");
        System.out.println(c1.getModel());

        // one arg constructor
        Car c2 = new Car("mercedes benz");


        ab.setName("P.Sherman");
        ab.setAddress("42 Wallaby Way");
        ab.setCity("Sydney");
        ab.setState("Australia");
        ab.setZip("12345");

        System.out.println("Enter the phone number in this format: (xxx) xxx-xxxx");
        ab.setPhone(input.nextLine());

        System.out.println("Enter the email in this format: name@domain.com");
        // Enter psherman@gmail.com
        ab.setEmail(input.nextLine());

        System.out.println(displayAddress(ab));
    }

    public static String displayAddress(AddressBook ab){
        return  "Name:          " + ab.getName()    + "\n" +
                "Address:       " + ab.getAddress() + "\n" +
                "City:          " + ab.getCity()    + "\n" +
                "State:         " + ab.getState()   + "\n" +
                "Zip:           " + ab.getZip()     + "\n" +
                "Phone:         " + ab.getPhone()   + "\n" +
                "Email:         " + ab.getEmail()   ;
    }
}
