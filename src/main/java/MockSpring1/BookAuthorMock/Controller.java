package MockSpring1.BookAuthorMock;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class Controller {

    @Autowired
    Service service;

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book){
        service.addBook(book);
        return "book added";
    }

    @PostMapping("/addAuthor")
    public String addAuthor(@RequestBody Author author){
        service.addAuthor(author);
        return "author added";
    }

    //    1. Get Author who are under a given age Y and have rating greater than X.
    @GetMapping("/getAuthor")
    public Author getAuthorByAge(@RequestParam("age") int age,@RequestParam("rating") int rating) throws Exception {
        return service.getAuthorByAge(age,rating);
    }


    //    2. Given bookname B and no of pages X, Update the no of pages in that book.
    @PutMapping("/update-book")
    public String updateBook(String bookName,int noOfPages){
        service.updateBook(bookName,noOfPages);
        return "book updated";
    }

//    3. GET: Find out total no. the books who’s authors have rating greater than X.

    @GetMapping("/find-Books")
    public int findBooks(int x){
        return service.findBooks(x); //
    }
}