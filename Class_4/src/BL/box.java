package BL;

public class box {
	private int lenght, breath, width;

	public box(int lenght, int breath, int width) {
		this.lenght = lenght;
		this.breath = breath;
		this.width = width;
	}

	public void display() {
		System.out.print("lenght: " + lenght);
		System.out.print("Breath: " + breath);
		System.out.print("Width: " + width);
	}

	public boolean isSame(box b) {
		if (this.breath == b.breath && this.lenght == b.lenght && this.width == b.width)
			return true;
		else
			return false;

	}

}
