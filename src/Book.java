public class Book {
    private String nameBook;

    private int publicationYear;

    private Author auth;
    public Book(String nameBook, Author fullName, int publicationYear) {
        this.nameBook = nameBook;
        this.publicationYear = publicationYear;
        this.auth = fullName;
    }

    public String getNameBook() {
        return this.nameBook;
    }
    public String getNameAuthor(){
        return  this.auth.getFirstName()+" "+this.auth.getLastName();
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }
    public void setPublicationYear(int year){
        this.publicationYear = year;
    }

    public String toString() {
        return "Книга - " + this.getNameBook() + " выпущенная автором " +
                this.getNameAuthor() + " опубликованная в " + this.getPublicationYear() + " году";
    }

    @Override
    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }
        if (compare == null || this.getClass() != compare.getClass()) {
            return false;
        }
        Book compareBook = (Book) compare; // double i = (double) 5;
        return (this.nameBook.equals(compareBook.nameBook) &&
                (this.publicationYear == compareBook.publicationYear)) &&
                (this.auth.equals(compareBook.auth));
    }

    public int hashCode() {
        int res1;
        if (this.nameBook == null) res1 = 0;
        else res1 = this.nameBook.hashCode();
        return res1 + this.publicationYear + this.auth.hashCode();
    }

    public static void myFunction() {
        System.out.println("Hello world");
    }
}
