package archive;

public class EBook extends File{

	private String title;
	private String author;
	private String type;
	
	public EBook(String filename, int number_of_downloads, int filesize, String title, String author, String type){
		super(filename, number_of_downloads, filesize);
		this.file_extension = ".pdf";
		this.setTitle(title);
		this.setAuthor(author);
		this.setAlbum(type);
		
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getType() {
		return type;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setAlbum(String type) {
		this.type = type;
	}
	
	@Override
	public void viewState() {
		System.out.println("========= EBOOK INFO =========");
		System.out.println("File Name: "+filename+file_extension);
		System.out.println("Title: "+title);
		System.out.println("Artist: "+author);
		System.out.println("Type: "+type);
		System.out.println("==============================");
	}
}
