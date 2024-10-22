package archive;


//Most variables are protected within thie archive Package since it is supposed to be only accessible within this package
//Most code below are pretty self explanatory
//Same goes for every class within this package
public class File implements Playable, Runnable{
	protected String filename;
	protected String file_extension;
	protected int number_of_downloads;
	protected int filesize;
	
	File(String filename, int number_of_downloads, int filesize){
		this.set_filename(filename);
		this.set_number_of_downloads(number_of_downloads);
		this.set_filesize(filesize);
	}
	
	public void viewState(){
		System.out.println("File Name: "+filename);
		System.out.println("Downloads: "+number_of_downloads);
		System.out.println("Size: "+filesize);
	}
	
	public String get_filename() {
		return filename;
	}
	public String get_file_extension() {
		return file_extension;
	}
	
	public int get_number_of_downloads() {
		return number_of_downloads;
	}
	
	public int get_filesize() {
		return filesize;
	}
	
	public void set_filename(String filename) {
		this.filename = filename;
	}
	public void set_file_extension(String file_extension) {
		this.file_extension = file_extension;
	}
	
	public void set_number_of_downloads(int number_of_downloads) {
		this.number_of_downloads = number_of_downloads;
	}
	public void set_filesize(int filesize) {
		this.filesize = filesize;
	}
	
	public void increment_downloads() {
		number_of_downloads += 1;
	}

	public void run() {
		
	}
	public void play() {
		
	}
}
