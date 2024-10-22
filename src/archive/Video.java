package archive;

public class Video extends File implements Playable{

	private String title;
	private String duration;
	private float rating;
	
	public Video(String filename, int number_of_downloads, int filesize, String title, String duration, float rating){
		super(filename, number_of_downloads, filesize);
		this.file_extension = ".mp4";
		this.setTitle(title);
		this.setDuration(duration);
		this.setRating(rating);
		
	}
	public String getTitle() {
		return title;
	}
	public String getDuration() {
		return duration;
	}
	public float getRating() {
		return rating;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
	@Override
	public void viewState() {
		System.out.println("========= VIDEO INFO =========");
		System.out.println("File Name: "+filename+file_extension);
		System.out.println("Title: "+title);
		System.out.println("Duration: "+duration);
		System.out.println("Rating: "+rating);
		System.out.println("==============================");
	}
	
	public void play() {
		System.out.println("Playing... "+title);
	}
}
