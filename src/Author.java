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

    public String toString() {
        return getFullName();
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return toString().equals(c2.toString());
    }

    public int hashCode() {
        return java.util.Objects.hash(toString());
    }

}
