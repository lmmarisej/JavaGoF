import java.util.ArrayList;

/**
 * 书架
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/3 10:38 下午
 */
public class BookSelf implements Aggregate {

    private final ArrayList<Book> books;

    public BookSelf(ArrayList<Book> books) {
        this.books = books;
    }

    public BookSelf() {
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

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
