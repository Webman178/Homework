public class Main {

    public static void main(String[] args) {
        String firstBook = "Harry Potter and the Philosophers Stone";
        String secondBook = "Alice in Wonderland";
        String firstAuthor = "Rowling Joanne";
        String secondAuthor = "Lewis Carrol";

        Author joanne = new Author("Joanne ", "Rowling");
        Author carrol = new Author("Carrol ", "Lewis");
        Book harry = new Book(firstBook, joanne, 2014);
        Book alice = new Book(secondBook, carrol, 2000);
        System.out.println(harry);
        System.out.println(alice);
        harry.setPublicationYear(2020);
        System.out.println(harry);

        Author a1 = new Author("a1","a2");
        Author a2 = new Author("a1","a3");
        System.out.println(a1.equals(a1)+"  "+a1.getClass());


        Book harry2 = new Book(firstBook, joanne, 2020);
        System.out.println(harry2.equals(harry));


        System.out.println(harry.hashCode());
        System.out.println(firstAuthor.hashCode());

        System.out.println(carrol);
        System.out.println(joanne);
    }

}