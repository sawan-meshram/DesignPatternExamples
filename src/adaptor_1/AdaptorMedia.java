package adaptor_1;

public class AdaptorMedia implements MediaPlayer{

	private AdvanceMediaPlayer player;

	public AdaptorMedia(AdvanceMediaPlayer player) {
		this.player = player;
	}

	@Override
	public void play() {
		if(player instanceof VLCPlayer)
			player.playVLC();
		else if(player instanceof WindowMediaPlayer)
			player.playMP4();
	}

}
