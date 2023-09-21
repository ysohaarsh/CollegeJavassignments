import java.time.LocalDate;
import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    private LocalDate dueDate;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void checkOut() {
        isAvailable = false;
        dueDate = LocalDate.now().plusWeeks(2);
    }

    public void checkIn() {
        isAvailable = true;
        dueDate = null;
    }

    public String toString() {
        String availability = isAvailable ? "Available" : "Checked out";
        return title + " by " + author + " (" + availability + ")";
    }
}

class Borrower {
    private String name;
    private int id;
    private double fines;

    public Borrower(String name, int id) {
        this.name = name;
        this.id = id;
        this.fines = 0.0;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getFines() {
        return fines;
    }

    public void addFine(double amount) {
        fines += amount;
    }

    public void payFines(double amount) {
        fines -= amount;
    }

    public String toString() {
        return name + " (ID: " + id + ")";
    }
}

class Library {
    private ArrayList<Book> books;
    private ArrayList<Borrower> borrowers;

    public Library() {
        this.books = new ArrayList<>();
        this.borrowers = new ArrayList<>();
    }

    public void addBook(String title, String author, String isbn) {
        books.add(new Book(title, author, isbn));
    }

    public void removeBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                break;
            }
        }
    }

    public void addBorrower(String name, int id) {
        borrowers.add(new Borrower(name, id));
    }

    public void removeBorrower(int id) {
        for (Borrower borrower : borrowers) {
            if (borrower.getId() == id) {
                borrowers.remove(borrower);
                break;
            }
        }
    }

    public Book findBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public Borrower findBorrower(int id) {
        for (Borrower borrower : borrowers) {
            if (borrower.getId() == id) {
                return borrower;
            }
        }
        return null;
    }

    public void checkOut(String isbn, int borrowerId) {
        Book book = findBook(isbn);
        Borrower borrower = findBorrower(borrowerId);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (borrower == null) {
            System.out.println("Borrower not found.");
            return;
        }
