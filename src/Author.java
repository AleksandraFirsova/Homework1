public class Author {
    String firstName;
    String middleName;
    String lastName;

    public Author(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName.charAt(0) + ". " +
                middleName.charAt(0) + ". " +
                lastName;
    }
}
