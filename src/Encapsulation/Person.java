package Encapsulation;

public class Person {

    // 12. changed to PRIVATE
    private String firstName;
    private String secondName;
//    4. this is now unnecessary
// public String fullName;

    //setter - every person must have full name

    public Person(String fullName) {
        //6. some validation added
        if (fullName != null) {
            // 5. changing this because we've added lines 5 and 6. We add a split.
            String[] nameParts = fullName.split(" ");
            // 7. putting the split name value into an array
            // 15b. changed to...
            // this.firstName = nameParts[0];
            setFirstName(nameParts[0]);

            // 9. if the name is more than just one name
            if (nameParts.length > 1) {
                this.secondName = nameParts[1];
            }
            // 8. removed because we're splitting it
//            this.fullName = fullName;
        }
    }

    //constructore for both first and surname
    public Person(String firstName, String secondName) {
        // 14a. Still possiblity to create name that doesn't have capitalisatoin of first  name
        // 15a. this.firstName = firstName;
        // So we change it to...
        setFirstName(firstName);
        this.secondName = secondName;
    }

    //getter
    public String getFullName() {
    // 10. this may still be used somewhere so we append original, 'return fullName;' to
        return this.firstName + " " + this.secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    // 13. make a rule for capitlisation of first name
    public void setFirstName(String firstName) {
        this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);

    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
