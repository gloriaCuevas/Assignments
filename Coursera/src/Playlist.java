
import java.util.ArrayList;

public class Playlist implements IComponent {

		public String playlistName;
		public ArrayList<IComponent> playlist = new ArrayList<IComponent>();

		public Playlist(String playlistName) {
			this.playlistName = playlistName;
		}

		public String getName() {
			// TODO Auto-generated method stub
			return this.playlistName;
		}

		public void play() {
			// TODO Auto-generated method stub\
			for(int i=0; i<playlist.size(); i++) {
				playlist.get(i).play();
			}
			
		}

		public void add(Song experimentalSong1) {
			// TODO Auto-generated method stub
			playlist.add(experimentalSong1);
		}

		public void setPlaybackSpeed(float slowSpeed) {
			// TODO Auto-generated method stub
			
		}

		public void add(Playlist experimentalPlaylist) {
			// TODO Auto-generated method stub
			playlist.add(experimentalPlaylist);
		}

		@Override
		public void setPlayBackSpeed(float speed) {
			// TODO Auto-generated method stub
			for(int i=0; i<playlist.size(); i++) {
				playlist.get(i).setPlayBackSpeed(speed);
			}
		}

	


	}