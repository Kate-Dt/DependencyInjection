import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;

public class Demo {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        LibraryReader reader = (LibraryReader) context.getBean("libraryReader");
        Collection<Book> toRead = reader.getBooks();
        toRead.forEach(Book::read);
    }
}
