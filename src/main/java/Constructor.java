public class Constructor {

    public String firstName;
    public String lastName;
    public String fullName;

    public Constructor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName = firstName + " " + lastName;
    }
}