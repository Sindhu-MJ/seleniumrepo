

	public class Car {
		public void SoundHorn() {
			System.out.println("SoundHorn");
		}
		public void TurnOnMusic() {
			System.out.println("TurnOnMusic");
		}
		public void ApplyBreak() {
			System.out.println("ApplyBreak");
		}
		public static void main(String[] args) {
			Car bmw=new Car();
			bmw.SoundHorn();
			bmw.TurnOnMusic();
			bmw.ApplyBreak();
		}


}
