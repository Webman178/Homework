import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {

        return this.firstName;
    }

    public String getLastName() {

        return this.lastName;
    }

    public boolean equals(Object compareAuthor) {
        if (this == compareAuthor)
            return true;
        if (compareAuthor == null || this.getClass() != compareAuthor.getClass())
            return false;
        Author toCompareAuthor = (Author) compareAuthor;

        return this.firstName.equals(toCompareAuthor.firstName) &&
                this.lastName.equals(toCompareAuthor.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public String toString() {
        return this.firstName + this.lastName;

    }
}