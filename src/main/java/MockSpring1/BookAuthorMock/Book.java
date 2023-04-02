package MockSpring1.BookAuthorMock;

public class Book {

    private String bookName;

    private int pages;

    private Author authorName;

    public Book() {
    }

    public Book(String bookName, int pages, Author authorName) {
        this.bookName = bookName;
        this.pages = pages;
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public void setAuthorName(Author authorName) {
        this.authorName = authorName;
    }
}
