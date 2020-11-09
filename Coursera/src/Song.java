
public class Song implements IComponent {
	public String songName;
	public String artist;
	public float speed = 1; // Default playback speed

	public Song(String songName, String artist ) {
		this.songName = songName;
		this.artist = artist; 
	}

	public String getArtist() {
		// TODO Auto-generated method stub
		return this.artist;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.songName;
	}

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play the song");
	}

	public void setPlaybackSpeed(float fasterSpeed) {
		// TODO Auto-generated method stub
		this.speed = fasterSpeed;
	}

	@Override
	public void setPlayBackSpeed(float speed) {
		// TODO Auto-generated method stub
		this.speed = speed;
	}


	
}
