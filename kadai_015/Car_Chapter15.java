package kadai_015;

public class Car_Chapter15 {
	private int gear = 1; //1速から5速のギアを表す
	private int speed = 10; //ギアチェンジ後の速度を表す
	
	//ギアの値により速度を変える
	public void gearChange(int afterGear) {
		this.gear = afterGear;
		this.speed = switch(this.gear) {
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
		};
	}
	//ギアチェンジ後の速度を表示する
	public void run () {
		
		System.out.println("ギア１から" + gear + "に切り替えました");
		System.out.println("速度は時速" + speed + "です");
	}
}
