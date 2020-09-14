package Lab_3;

public class Book {
    private String name;
    private String author;
    private String genre;
    private int year;

    public Book(String name, String author, String genre, int year){
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("Book {Name: %s, Author: %s, Genre: %s, Year %d}",
                this.name,
                this.author,
                this.genre,
                this.year);
    }
}

