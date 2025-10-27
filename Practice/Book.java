public class Book {
    private String title;
    private String author;
    private String publisher;
    private String copyrightDate;


    public Book(String title, String author, String publisher, String copyrightDate){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyrightDate = copyrightDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getCopyrightDate() {
        return copyrightDate;
    }

    public String toString() {
        return "Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nPublisher: " 
                + getPublisher() + "\nCopyright Date: " + getCopyrightDate();
    }
}