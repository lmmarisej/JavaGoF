/**
 * 书架上的书的迭代器
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/3 10:37 下午
 */
public class BookShelfIterator implements Iterator {

    private BookSelf bookSelf;
    private int index;

    public BookShelfIterator(BookSelf bookSelf) {
        this.bookSelf = bookSelf;
        this.index = 0;
    }

    @Override
    public boolean hashNext() {
        return bookSelf.getLength() > index;
    }

    @Override
    public Book next() {
        return bookSelf.getBookAt(index++);
    }
}
