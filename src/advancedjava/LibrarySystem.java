package advancedjava;

import java.sql.*;

public class LibrarySystem {
    // Database configuration
    static final String DB_URL = "jdbc:mysql://localhost/library";
    static final String USER = "root";
    static final String PASS = "password";

    // SQL queries
    static final String ADD_BOOK_QUERY = "INSERT INTO books (title, author, publisher, year) VALUES (?, ?, ?, ?)";
    static final String UPDATE_BOOK_QUERY = "UPDATE books SET title=?, author=?, publisher=?, year=? WHERE id=?";
    static final String DELETE_BOOK_QUERY = "DELETE FROM books WHERE id=?";
    static final String VIEW_ALL_BOOKS_QUERY = "SELECT * FROM books";
    static final String SEARCH_BOOK_QUERY = "SELECT * FROM books WHERE title LIKE ? OR author LIKE ? OR publisher LIKE ? OR year LIKE ?";

    // Add a new book to the database
    public static void addBook(String title, String author, String publisher, String year) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement(ADD_BOOK_QUERY)) {
            stmt.setString(1, title);
            stmt.setString(2, author);
            stmt.setString(3, publisher);
            stmt.setString(4, year);
            stmt.executeUpdate();
            System.out.println("Book added successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update an existing book in the database
    public static void updateBook(int id, String title, String author, String publisher, String year) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement(UPDATE_BOOK_QUERY)) {
            stmt.setString(1, title);
            stmt.setString(2, author);
            stmt.setString(3, publisher);
            stmt.setString(4, year);
            stmt.setInt(5, id);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Book updated successfully");
            } else {
                System.out.println("No book found with ID " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete a book from the database
    public static void deleteBook(int id) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement(DELETE_BOOK_QUERY)) {
            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Book deleted successfully");
            } else {
                System.out.println("No book found with ID " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // View all books in the database
    public static void viewAllBooks() {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(VIEW_ALL_BOOKS_QUERY);
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author = rs.getString("author");
                String publisher = rs.getString("publisher");
                String year = rs.getString("year");
                System.out.printf("%d\t%s\t%s\t%s\t%s%n", id, title, author, publisher, year);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Search for books in the database by title, author, publisher, or year
    public static void searchBook(String keyword) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        PreparedStatement stmt = conn.prepareStatement(SEARCH_BOOK_QUERY)) {
            String searchKeyword = "%" + keyword + "%";
            stmt.setString(1, searchKeyword);
            stmt.setString(2, searchKeyword);
            stmt.setString(3, searchKeyword);
            stmt.setString(4, searchKeyword);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author = rs.getString("author");
                String publisher = rs.getString("publisher");
                String year = rs.getString("year");
                System.out.printf("%d\t%s\t%s\t%s\t%s%n", id, title, author, publisher, year);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        // Create the books table if it doesn't exist
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement()) {
            String createTableQuery = "CREATE TABLE IF NOT EXISTS books (" +
                    "id INT NOT NULL AUTO_INCREMENT," +
                    "title VARCHAR(255) NOT NULL," +
                    "author VARCHAR(255) NOT NULL," +
                    "publisher VARCHAR(255) NOT NULL," +
                    "year VARCHAR(4) NOT NULL," +
                    "PRIMARY KEY (id)" +
                    ")";
            stmt.executeUpdate(createTableQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        // Test the LibrarySystem class
        addBook("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", "Pan Books", "1979");
        addBook("The Lord of the Rings", "J.R.R. Tolkien", "George Allen & Unwin", "1954");
        viewAllBooks();
        updateBook(1, "The Hitchhiker's Guide to the Galaxy (Updated)", "Douglas Adams", "Pan Books", "1979");
        deleteBook(2);
        searchBook("hitchhiker");
    }} 

import java.sql.*;

public class LibraryManager {

    private final String url = "jdbc:mysql://localhost:3306/library";
    private final String username = "root";
    private final String password = "";

    public void addBook(String title, String author, String isbn) {
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO books (title, author, isbn) VALUES (?, ?, ?)")) {
            stmt.setString(1, title);
            stmt.setString(2, author);
            stmt.setString(3, isbn);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removeBook(int bookId) {
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM books WHERE book_id = ?")) {
            stmt.setInt(1, bookId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void borrowBook(int bookId, int borrowerId) {
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement("UPDATE books SET available = false WHERE book_id = ?")) {
            stmt.setInt(1, bookId);
            stmt.executeUpdate();
            stmt.close();

            stmt = conn.prepareStatement("INSERT INTO book_borrowers (book_id, borrower_id) VALUES (?, ?)");
            stmt.setInt(1, bookId);
            stmt.setInt(2, borrowerId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void returnBook(int bookId) {
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement("UPDATE books SET available = true WHERE book_id = ?")) {
            stmt.setInt(1, bookId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet searchBooks(String keyword) {
        ResultSet rs = null;
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM books WHERE title LIKE ? OR author LIKE ? OR isbn LIKE ?")) {
            stmt.setString(1, "%" + keyword + "%");
            stmt.setString(2, "%" + keyword + "%");
            stmt.setString(3, "%" + keyword + "%");
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void addBorrower(String name, String email) {
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO borrowers (name, email) VALUES (?, ?)")) {
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
        public void removeBorrower(int borrowerId) {
            try (Connection conn = DriverManager.getConnection(url, username, password);
                 PreparedStatement stmt = conn.prepareStatement("DELETE FROM borrowers WHERE borrower_id = ?")) {
                stmt.setInt(1, borrowerId);
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        public ResultSet searchBorrowers(String keyword) {
            ResultSet rs = null;
            try (Connection conn = DriverManager.getConnection(url, username, password);
                 PreparedStatement stmt = conn.prepareStatement("SELECT * FROM borrowers WHERE name LIKE ? OR email LIKE ?")) {
                stmt.setString(1, "%" + keyword + "%");
                stmt.setString(2, "%" + keyword + "%");
                rs = stmt.executeQuery();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return rs;
        }

        
public class Main {
    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManager();

        // Add a book
        libraryManager.addBook("Java for Beginners", "John Smith", "1234567890");

        // Search for books
        ResultSet rs = libraryManager.searchBooks("Java");
        while (rs.next()) {
            System.out.println(rs.getString("title") + " by " + rs.getString("author"));
        }

        // Add a borrower
        libraryManager.addBorrower("Jane Doe", "jane@example.com");

        // Search for borrowers
        rs = libraryManager.searchBorrowers("Jane");
        while (rs.next()) {
            System.out.println(rs.getString("name") + " (" + rs.getString("email") + ")");
        }

        // Borrow a book
        libraryManager.borrowBook(1, 1);

        // Return a book
        libraryManager.returnBook(1);
    }
}
}

    
