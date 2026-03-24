package Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Skill-6 Spring MVC";
    }

    @GetMapping("/count")
    public int count() {
        return 10;
    }

    @GetMapping("/price")
    public double price() {
        return 499.99;
    }

    @GetMapping("/books")
    public List<String> books() {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("React");
        return list;
    }

    @GetMapping("/books/{id}")
    public String bookById(@PathVariable("id") int id) {
        return "Book ID: " + id;
    }

    @GetMapping("/search")
    public String search(@RequestParam("title") String title) {
        return "Searching book: " + title;
    }
}