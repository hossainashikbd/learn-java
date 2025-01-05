package ClassTest;

import java.util.ArrayList;
import java.util.List;


interface Searchable {
    boolean search(String keyword);
}

class Document implements Searchable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public boolean search(String keyword) {
        return content != null && content.contains(keyword);
    }
}

class WebPage implements Searchable {
    private String url;
    private String content;

    public WebPage(String url, String content) {
        this.url = url;
        this.content = content;
    }

    @Override
    public boolean search(String keyword) {
        return content != null && content.contains(keyword);
    }

    public String getUrl() {
        return url;
    }
}

public class SearchableDemo {
    public static void main(String[] args) {

        List<Searchable> items = new ArrayList<>();


        items.add(new Document("This is a plain text document. It contains sample data."));
        items.add(new WebPage("http://example.com", "Welcome to the example webpage. Here is some content about Java."));


        String keyword = "Java";


        for (Searchable item : items) {
            if (item.search(keyword)) {
                System.out.println("Keyword found in: " +
                        (item instanceof WebPage ? "WebPage URL: " + ((WebPage) item).getUrl() : "Document"));
            } else {
                System.out.println("Keyword not found in: " +
                        (item instanceof WebPage ? "WebPage URL: " + ((WebPage) item).getUrl() : "Document"));
            }
        }
    }
}

