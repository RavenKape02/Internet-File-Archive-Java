package archive;

public class Audio extends File implements Playable{
	
	private String title;
	private String author;
	private String album;
	
	public Audio(String filename, int number_of_downloads, int filesize,String title, String author, String album) {
		super(filename, number_of_downloads, filesize);
		this.file_extension = ".mp3";
		this.setTitle(title);
		this.setAuthor(author);
		this.setAlbum(album);
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getAlbum() {
		return album;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
	@Override
	public void viewState() {
		System.out.println("File Name: "+filename+file_extension);
		System.out.println("Title: "+title);
		System.out.println("Artist: "+author);
		System.out.println("Album: "+album);
	}
	
	@Override
	public void play() {
		System.out.println("Playing... "+title+" by "+author);
	}
}
