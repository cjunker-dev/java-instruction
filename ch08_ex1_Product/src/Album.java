
public class Album extends Product {
	String artist;
	public Album() {
		 artist = "";
	     count++;
	}
	@Override
	public String toString() {
		return "Description: " + getDescription() + " (" + artist + ")";
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
}