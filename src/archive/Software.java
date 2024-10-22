package archive;

public class Software extends File implements Runnable{
	
	private String title;
	private String category;
	private String publisher;
	
	public Software(String filename, int number_of_downloads, int filesize, String title, String category, String publisher){
		super(filename, number_of_downloads, filesize);
		this.file_extension = ".exe";
		this.setTitle(title);
		this.setCategory(category);
		this.setPublisher(publisher);
		
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getPublisher() {
		return publisher;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public void viewState() {
		System.out.println("========= SOFTWARE INFO =========");
		System.out.println("File Name: "+filename+file_extension);
		System.out.println("Title: "+title);
		System.out.println("Category: "+category);
		System.out.println("Publisher: "+publisher);
		System.out.println("==============================");
	}
	
	@Override
	public void run() {
		System.out.println("Running "+filename+file_extension);
		System.out.println("Finished.");
	}
}
