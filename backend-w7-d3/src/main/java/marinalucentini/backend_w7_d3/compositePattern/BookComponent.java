package marinalucentini.backend_w7_d3.compositePattern;

import java.util.List;

public interface BookComponent {
    int getNumberPage();
    List<String> getAuthors();
    double getprice();
    void print();

}
