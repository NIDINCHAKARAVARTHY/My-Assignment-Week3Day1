package week3.day1;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop Size");
	}
	public static void main(String[] args) {
		Desktop opt = new Desktop();
		opt.desktopSize();
		opt.computerModel();
	}

}
