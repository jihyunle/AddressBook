import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);
        AddressBook ab = new AddressBook();
        ab.setName("P.Sherman");
        ab.setAddress("42 Wallaby Way");
        ab.setCity("Sydney");
        ab.setState("Australia");
        ab.setZip("12345");
        System.out.println("Enter the phone number in this format: (xxx) xxx-xxxx");
        ab.setPhone(keybd.nextLine());
        System.out.println("Enter the email in this format: name@domain.com");
        // Enter psherman@gmail.com
        ab.setEmail(keybd.nextLine());

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
