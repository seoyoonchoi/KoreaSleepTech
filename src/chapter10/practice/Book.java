package chapter10.practice;

public class Book extends Item{
    private String isbn; //책 고유번호(전 세계 통용됨)
    private String author; //자까
    private String publisher;
    private String category;
    private int publishYear;
    private int price;
    private int stock;

    public Book(String id, String name, String isbn, String author, String publisher, String category, int publishYear, int price, int stock) {
        super(id, name);
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        this.publishYear = publishYear;
        this.price = price;
        this.stock = stock;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getCategory() {
        return category;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void updateStock(int quantity){
        this.stock += quantity;
    }

    @Override
    public void display() {
        System.out.println("ID : "+getId()+", Name: "+getName()+",ISBN: "+isbn);

    }
}
