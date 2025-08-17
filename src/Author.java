public class Author {
    private String firstName;
    private String lastName;
    private String fullName;

    public Author (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName () {
        fullName = firstName + " " + lastName;
        return fullName;
    }

    public String getLastName () {
        return lastName;
    }

}
