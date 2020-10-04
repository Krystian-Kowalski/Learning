package Unit4.CollectionRevision;

import java.util.ArrayList;
import java.util.List;

public class ForIterator {
    public static void main(String[] args) {
        List<String> companies = new ArrayList<>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        for (int i = 0; i < companies.size(); i++) {
            System.out.println(companies.get(i));
        }
    }
}
