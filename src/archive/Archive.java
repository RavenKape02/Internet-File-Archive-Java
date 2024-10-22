package archive;

import java.util.ArrayList;

//I used arraylist for the archive
public class Archive {
	
	
	private String archive_name;
	ArrayList<File> archive = new ArrayList<File>();
	
	public Archive(String archive_name) {
		this.set_archiveName(archive_name);
	}
	
	public String get_archiveName() {
		return archive_name;
	}
	public void set_archiveName(String archive_name) {
		this.archive_name = archive_name;
	}
	
	//function for adding a file to archive
	public void addFile(File file_to_add) {
		archive.add(file_to_add);
		System.out.println("File "+file_to_add.filename+file_to_add.file_extension+" added to the archive.");
	}
	
	//boolean function for searching file
	public boolean searchFile(String name_of_file) {
		boolean file_found = false;
		for(int i = 0; i<archive.size(); i++) {
			File current_file = archive.get(i);
			if(name_of_file.equalsIgnoreCase(current_file.filename)) {
				file_found = true;
			}
		}
		return file_found;
	}
	
	public void playAll() {
		for(int i = 0; i < archive.size(); i++) {
			File accessFile = archive.get(i);
			if((accessFile.file_extension.equalsIgnoreCase(".mp3"))||(accessFile.file_extension.equalsIgnoreCase(".mp4"))) {
				accessFile.play();
			}
		}
	}
	
	public void runAll() {
		for(int i = 0; i < archive.size(); i++) {
			File accessFile = archive.get(i);
			if(accessFile.file_extension.equalsIgnoreCase(".exe")) {
				accessFile.run();
			}
		}
	}
	
	public void viewState() {
		System.out.println("===========ARCHIVE STATE==============");
		System.out.println("Name: "+archive_name);
		System.out.println("File Count: "+archive.size());
		System.out.println("Collection of Files: ");
		for(int i = 0; i < archive.size(); i++) {
			File accessFile = archive.get(i);
			System.out.println("File Name: "+accessFile.filename+accessFile.file_extension);
			System.out.println("File Size: "+accessFile.filesize+" KB");
		}
		System.out.println("===================================");
	}
}
