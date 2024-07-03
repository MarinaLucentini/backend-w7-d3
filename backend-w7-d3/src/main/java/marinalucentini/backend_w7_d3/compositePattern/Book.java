package marinalucentini.backend_w7_d3.compositePattern;

import lombok.Getter;

import java.util.List;
import java.util.SimpleTimeZone;
@Getter
public class Book extends Section{
    private List<String> authors;
    private double price;
    public Book(String title, List<String> authors, double price) {
        super(title);
        this.authors = authors;
        this.price = price;
    }

    public int getTotalNumberOfPages() {
        return getNumberPage();
    }
}
