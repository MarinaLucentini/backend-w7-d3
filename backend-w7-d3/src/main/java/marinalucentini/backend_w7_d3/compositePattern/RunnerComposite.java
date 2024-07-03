package marinalucentini.backend_w7_d3.compositePattern;

import marinalucentini.backend_w7_d3.adapterPattern.DataSource;
import marinalucentini.backend_w7_d3.adapterPattern.Info;
import marinalucentini.backend_w7_d3.adapterPattern.UserData;
import marinalucentini.backend_w7_d3.adapterPattern.infoAdapter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Calendar;

@Component
public class RunnerComposite implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Page page1 = new Page(1, "Content of page 1");
        Page page2 = new Page(2, "Content of page 2");
        Page page3 = new Page(3, "Content of page 3");
        Section subsection = new Section("Subsection 1.1");
        subsection.addComponent(page2);
        Section section1 = new Section("Section 1");
        section1.addComponent(page1);
        section1.addComponent(subsection);
        Book book = new Book("My Book", Arrays.asList("Author 1", "Author 2"), 29.99);
        book.addComponent(section1);
        book.addComponent(page3);
        book.print();
        System.out.println("Total number of pages: " + book.getTotalNumberOfPages());
        System.out.println("Authors: ");
        book.getAuthors().forEach(System.out::println);
        System.out.println("Price: " + book.getPrice());
    }
}
