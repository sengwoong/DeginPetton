import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator2 implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator2(BookShelf2 bookShelf2) {
        this.bookShelf = bookShelf2;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
