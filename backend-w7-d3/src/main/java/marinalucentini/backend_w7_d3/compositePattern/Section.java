package marinalucentini.backend_w7_d3.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Section implements BookComponent{
    private String title;
    private List<BookComponent> components;

    public Section(String title) {
        this.title = title;
this.components = new ArrayList<>();
    }

    public void addComponent(BookComponent component) {
        components.add(component);
    }

    @Override
    public int getNumberPage() {
        return components.stream().mapToInt(BookComponent::getNumberPage).sum();
    }

    @Override
    public List<String> getAuthors() {
        List<String> authors = new ArrayList<>();
        for (BookComponent component : components) {
            authors.addAll(component.getAuthors());
        }
        return authors;
    }

    @Override
    public double getprice() {
        return components.stream().mapToDouble(BookComponent::getprice).sum();
    }

    @Override
    public void print() {
        System.out.println("Section " + title);
  components.forEach(BookComponent::print);

    }
}
