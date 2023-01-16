package Library_Managment;

public class Book {

	private String title;
	private String auther;
	private String ISBN;
	private String publisher;

    public Book() {  }  // <----- To added

    public Book(String title, String auther, String ISBN, String publisher) {    // <----- To added
        this.title = title;
        this.auther = auther;
        this.ISBN = ISBN;
        this.publisher = publisher;
    }
        

    public void show_bookInfos() {        // <----- To added
                  
        System.out.println("Le titre du livre:" + title);
        System.out.println("L'auteur:"+ auther);
        System.out.println("Livre ISBN:" + ISBN);
        System.out.println("Livre:" + publisher);
        System.out.println("");
	}

	public void Reservation_status() { }
	public void Feedback() { }
	public void Book_request() { 	}

    public String getTitle() {   // <----- To added
        return title;
    } 
}


