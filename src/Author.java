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

    public int hashCode() {
        int result1;
        int result2;
        if (this.firstName == null) result1 = 0;
        else result1 = this.firstName.hashCode();
        if (this.lastName == null) result2 = 0;
        else result2 = this.lastName.hashCode();
        return result2 + result1;
    }

    public String toString() {
        return this.firstName + this.lastName;

    }
}