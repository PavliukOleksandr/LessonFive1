package LessonFive1;

public class Swallow extends FlyingBird{
	private String s;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public Swallow(String feathers, String layEggs, String s) {
		super(feathers, layEggs);
		this.s = s;
	}	
}
