/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/3 10:30 下午
 */
public class Book {
    private String name;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
