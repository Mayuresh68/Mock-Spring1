package MockSpring1.BookAuthorMock;

import java.util.HashMap;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {

    HashMap<String , Book> bookHashMap = new HashMap<>();

    HashMap<String , Author> authorHashMap = new HashMap<>();

    HashMap<String , List<String>> authorBookHashMap = new HashMap<>();

    public void addBook(Book book) {
        bookHashMap.put(book.getBookName(),book);
    }

    public void addAuthor(Author author) {
        authorHashMap.put(author.getName(),author);
    }

    //under a given age Y and have rating greater than X.
    public Author getAuthorByAge(int age,int rating) throws Exception {
        Author findAuthor = null;
        for(Author author : authorHashMap.values()){
            if(author.getAge()<age ){
                if(author.getRating()>rating){
                    findAuthor = author;
                }
            }
            else{
                throw new Exception("Author not found");
            }
        }
        return findAuthor;
    }

    // 2. Given bookname B and no of pages X, Update the no of pages in that book
    public void updateBook(String bookName, int noOfPages) {
        Book book = null;
        if(bookHashMap.containsKey(bookName)){
            book = bookHashMap.get(bookName);
            int currpages = book.getPages();
            book.setPages(currpages + noOfPages);
        }
        bookHashMap.put(bookName,book);

    }

    public int  findBooks(int x) {
        int bookCount=0;
        for(Book book : bookHashMap.values()){
            Author author = book.getAuthorName();
            float rating = author.getRating();
            if(rating > x){
                bookCount++;
            }

        }
        return bookCount;
    }


}
