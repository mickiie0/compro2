import java.util.ArrayList;

// ข้อ 1: สร้างคลาส Book
class Book {
    // ข้อ 2: สร้างตัวแปรสำหรับเก็บข้อมูลหนังสือ
    public String isbn;    
    public String title;
    public String type;
    public double price;

    // ข้อ 3: สร้าง constructor สำหรับกำหนดค่าเริ่มต้น
    public Book(String isbn, String title, String type, double price){
        this.isbn = isbn;
        this.title = title;
        this.type = type;
        this.price = price;
    }
}

class BookStore {
    // ข้อ 6: สร้าง ArrayList สำหรับเก็บหนังสือ
    public ArrayList<Book> books = new ArrayList<Book>();

    // ข้อ 7: เมธอดสำหรับเติมหนังสือ
    public void addBook(String isbn, String title, String type, double price) {
        Book newBook = new Book(isbn, title, type, price);
        books.add(newBook);
    }
}

public class BookRecord {
    
    void testConstructor() { 
        Book b = new Book("9780134464541",  
            "Vulkan Programming Guide", "Programming", 50.78); 
        System.out.println(b.isbn); 
        System.out.println(b.title); 
        System.out.println(b.type); 
        System.out.println(b.price); 
    } 
  
    public static void main(String[] args) { 
        BookRecord tester = new BookRecord(); 
        tester.testConstructor(); 

        BookStore store = new BookStore();
        
        // ทดสอบการเรียกใช้เมธอด addBook
        store.addBook("9780134464541", "Vulkan Programming Guide", "Programming", 50.78);
        store.addBook("9781491914250", "Deep Learning: A Practitioner's Approach", "Computer Science", 28.56);
        store.addBook("9780321287137", "Linear Algebra and Its Applications", "Mathematics", 9.95);
        
        // แสดงผลลัพธ์หนังสือทั้งหมดในร้าน
        for (Book b : store.books) {
            System.out.println(b.title + " (" + b.type + ") - $" + b.price);
        }
    } 
}
