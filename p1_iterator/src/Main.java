/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/3 10:30 下午
 */
public class Main {
    public static void main(String[] args) {
        BookSelf bookSelf = new BookSelf();
        bookSelf.appendBook(new Book("《金瓶梅》"));
        bookSelf.appendBook(new Book("《西游记》"));
        bookSelf.appendBook(new Book("《水浒传》"));
        Iterator iterator = bookSelf.iterator();
        while (iterator.hashNext()) {
            System.out.println(iterator.next());
        }
    }
}
