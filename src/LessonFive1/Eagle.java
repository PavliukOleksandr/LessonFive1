package LessonFive1;

public class Eagle extends FlyingBird {
	private String e;

	public String getE() {
		return e;
	}

	public void setE(String e) {
		this.e = e;
	}

	public Eagle(String feathers, String layEggs, String e) {
		super(feathers, layEggs);
		this.e = e;
	}
}
