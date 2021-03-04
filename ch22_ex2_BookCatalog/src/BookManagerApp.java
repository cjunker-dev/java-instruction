import java.util.List;
import java.util.stream.Collectors;

public class BookManagerApp {

    public static void main(String[] args) {
        List<Book> bookList = new BookCatalog().getCatalog();
        
        System.out.println("\nBOOKS BY TITLE:");
        bookList.stream()
	    	.filter(b -> b.getTitle() == "Java Programming")
	    	.forEach(b -> System.out.println(b));
        
        System.out.println("\nBOOKS BY CATEGORY:");
        bookList.stream()
    		.filter(b -> b.getCategory().equals(Book.JAVA))
    		.forEach(b -> System.out.println(b));
                
        System.out.println("\nBOOKS BY FORMAT:");
        bookList.stream()
	    	.filter(b -> b.getFormat() == "Paperback")
	    	.forEach(b -> System.out.println(b));
        
        System.out.println("\nDATABASE BOOK TITLES:");
        bookList.stream()
        	.filter(b -> b.getCategory().equals(Book.DATABASE))
        	.map(b -> b.getTitle() + " (" + b.getFormat() + ")")
        	.forEach(System.out::println);
    }
    
    public static void printList(List<Book> bookList) {
        for (Book b : bookList) {
            System.out.println(b);
        }
    }    
}