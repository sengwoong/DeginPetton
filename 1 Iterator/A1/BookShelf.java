import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> {
    private List<Book> books;
    private List<Book> bookIndex;
    
    public BookShelf() {
        this.books = new ArrayList<>();
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }
//Iterator<데이터타입> iterator명 = 컬렉션.iterator();
    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
