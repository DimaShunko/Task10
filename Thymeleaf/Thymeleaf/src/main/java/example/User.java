package example;

public class User {
    String LastName;
    String FirstName;
    String MiddleName;

    public User() {
    }

    public User(String lastName, String firstName, String middleName) {
        LastName = lastName;
        FirstName = firstName;
        MiddleName = middleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }
}
