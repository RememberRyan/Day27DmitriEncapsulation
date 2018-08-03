package Encapsulation;

public class Main {
    public static void main(String[] args) {
        // CMD + ALT + V (for variable) .... new xxxxx ()
        Person johnSmith = new Person("John Smith");
        // 14b. eg "sarah connor"
        Person sarahConnor = new Person("sarah Connor");

        //Two ways of printing out the full name
        // 11. fullName property was deleted
        //System.out.println(johnSmith.fullName);


        johnSmith.setFirstName("patrick");
        System.out.println(johnSmith.getFirstName());
        System.out.println(johnSmith.getFullName());
        System.out.println(sarahConnor.getFullName());



    }
}
