package adaptor_1;

public class AdaptorMediaTest {
	public static void main(String[] args) {
		MediaPlayer player = new AdaptorMedia(new VLCPlayer());
		player.play();
		
		MediaPlayer player2 = new AdaptorMedia(new WindowMediaPlayer());
		player2.play();
	}
}
