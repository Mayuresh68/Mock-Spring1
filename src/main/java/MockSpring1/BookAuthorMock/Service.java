package MockSpring1.BookAuthorMock;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Repository repository;
    public void addBook(Book book) {
        repository.addBook(book);
    }

    public void addAuthor(Author author) {
        repository.addAuthor(author);
    }

    public Author getAuthorByAge(int age,int rating) throws Exception {
        return repository.getAuthorByAge(age,rating);
    }

    public void updateBook(String bookName,int noOfPages) {
        repository.updateBook(bookName,noOfPages);
    }

    public int  findBooks(int x) {
        return repository.findBooks(x);
    }
}