/***********************************************************
* //Exercise 05: Internet File Archive
*
* @author CADUYAC, JOHN RAVEN F.
* @created_date 2024-09-29 1:01:AM
*
*
***********************************************************/

package main;
import archive.*;

public class Main {

	public static void main(String[] args) {
		Archive mainArchive = new Archive("Main Archive");
		User juan = new User("000A1001", "Juan dela Cruz", 9000000, 0);
		User cardo = new User("000B2002", "Cardo Dalisay", 16500000, 0);
		
		EBook darkness = new EBook("left_hand_of_darkness", 0, 8800, "Left Hand of Darkness", "Ursula K. Le Guin", "Fiction");
		EBook calculus = new EBook("calculus7", 0, 20000, "The Calculus 7", "Louis Leithold", "Article");
		Audio playinggod = new Audio("playing_god", 0, 27400,"Playing God", "Polyphia", "Remember That You Will Die");
		Audio roundabout = new Audio("roundabout", 0, 84600,"Round About", "Yes", "Fragile");
		Video godzilla = new Video("godzillaminus12.2023.1080p", 0, 2500000, "Godzilla Minus One", "2:15:00", 7.7f);
		Video furious = new Video("furiosa_mad_max_story.2024.4K", 0, 12950000, "Furiosa: A Mad Max Story", "2:28:00", 7.5f);
		Video blade = new Video("BladeRunner2049.1080p.DVDRIP", 0, 6150000, "Blade Runner 2049", "2:44:00", 8.0f);
		Video promare = new Video("[HorribleSubs]Promare.1080p", 0, 1564000, "Promare", "1:51:00", 7.0f);
		Software steam = new Software("steam_installer", 0, 129000, "Steam", "games", "Valve Corporation");
		Software davinci = new Software("davinci_resolve", 0, 2150000, "DaVinci Resolve", "productivity", "Blackmagic Design");
		Software intellij = new Software("intellij_idea", 0, 3600000, "IntelliJ IDEA", "development", "JetBrains");
		
		mainArchive.addFile(darkness);
		mainArchive.addFile(calculus);
		mainArchive.addFile(playinggod);
		mainArchive.addFile(roundabout);
		mainArchive.addFile(godzilla);
		mainArchive.addFile(furious);
		mainArchive.addFile(blade);
		mainArchive.addFile(promare);
		mainArchive.addFile(steam);
		mainArchive.addFile(davinci);
		mainArchive.addFile(intellij);
		
		juan.downloadFile(darkness, mainArchive);
		juan.downloadFile(calculus, mainArchive);
		juan.downloadFile(godzilla, mainArchive);
		juan.downloadFile(promare, mainArchive);
		juan.downloadFile(steam, mainArchive);
		juan.downloadFile(intellij, mainArchive);
		juan.downloadFile(davinci, mainArchive);	
		
		cardo.downloadFile(davinci, mainArchive);
		cardo.downloadFile(furious, mainArchive);
		cardo.downloadFile(roundabout, mainArchive);
		cardo.downloadFile(playinggod, mainArchive);
		
		mainArchive.viewState();
		juan.viewState();
		cardo.viewState();
		
		darkness.viewState();
		calculus.viewState();
		playinggod.viewState();
		roundabout.viewState();
		godzilla.viewState();
		furious.viewState();
		blade.viewState();
		promare.viewState();
		steam.viewState();
		davinci.viewState();
		intellij.viewState();
		
		mainArchive.playAll();
		mainArchive.runAll();
	}

}
