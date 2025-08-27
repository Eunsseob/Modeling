package _02_ocp;

public class OcpRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SoundPlayer sp = new SoundPlayer();
	
		sp.setPlayInter(new Wav());
		
		sp.play();
		
		sp.setPlayInter(new Mp3());
		
		sp.play();
		
		sp.setPlayInter(new Flac());
		
		sp.play();
	}

}
