package marinalucentini.backend_w7_d3.compositePattern;

import java.util.List;

public class Page implements BookComponent{
    private int pageNumber;
    private String content;
    @Override
    public int getNumberPage() {
        return 1;
    }

    @Override
    public List<String> getAuthors() {
        return List.of();
    }

    @Override
    public double getprice() {
        return 0;
    }

    @Override
    public void print() {
        System.out.println("Page " + pageNumber + "content " + content);
    }

    public Page(int pageNumber, String content) {
        this.pageNumber = pageNumber;
        this.content = content;
    }
}
