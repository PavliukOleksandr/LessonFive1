package LessonFive1;

public class Penguin extends NonFlyingBird {
	private String p;

	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}

	public Penguin(String feathers, String layEggs, String p) {
		super(feathers, layEggs);
		this.p = p;
	}
}
