package archive;

import java.util.ArrayList;

public class User {
	private String user_id;
	private String username;
	private int maximum_download_size;
	private int current_download_size;
	
	ArrayList<File> downloaded_files = new ArrayList<File>();
	
	public User(String user_id, String username, int maximum_download_size, int current_download_size) {
		this.setUserID(user_id);
		this.setUsername(username);
		this.setMaxDownSize(maximum_download_size);
		this.setCurrentDownSize(current_download_size);
	}
	
	public String getUserID() {
		return user_id;
	}
	public String getUsername() {
		return username;
	}
	public int getMaxDownSize() {
		return maximum_download_size;
	}
	public int getCurrentDownSize() {
		return current_download_size;
	}
	
	public void setUserID(String user_id) {
		this.user_id = user_id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setMaxDownSize(int maximum_download_size) {
		this.maximum_download_size = maximum_download_size;
	}
	public void setCurrentDownSize(int current_download_size) {
		this.current_download_size = current_download_size;
	}
	
	//function for downloading files
	public void downloadFile(File file_to_download, Archive mainArchive) {
		System.out.println("#====>>>");
		System.out.println("User "+username+" is trying to download "+file_to_download.filename+file_to_download.file_extension+" from archive");
		//basically this if function is to check if the file exists AND if the file size added to current download size wont go beyond maximum
		if((mainArchive.searchFile(file_to_download.filename)) && ((current_download_size+file_to_download.get_filesize())<maximum_download_size)) {
			System.out.println("The file "+file_to_download.filename+file_to_download.file_extension +" is in Archive's collection.");
			downloaded_files.add(file_to_download);
			System.out.println("The file was successfully downloaded.");
			current_download_size += file_to_download.get_filesize();
			int app_downloads = file_to_download.get_number_of_downloads() + 1;
			file_to_download.set_number_of_downloads(app_downloads);
		}else {
			System.out.println(username+" can't download "+file_to_download.filename+file_to_download.file_extension);
		}
		
	}
	
	public void viewState() {
		System.out.println("===========USER STATE==============");
		System.out.println("User ID: "+user_id);
		System.out.println("Name: "+username);
		System.out.println("Storage: "+current_download_size+"/"+maximum_download_size);
		System.out.println("Media: ");
		for(int i = 0; i < downloaded_files.size(); i++) {
			File currentFile = downloaded_files.get(i);
			System.out.println("Filename: "+currentFile.filename+currentFile.file_extension);
		}
		System.out.println("===================================");
	}
}
