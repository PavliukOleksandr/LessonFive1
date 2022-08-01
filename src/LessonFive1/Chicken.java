package LessonFive1;

public class Chicken extends NonFlyingBird{
	private String c;

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public Chicken(String feathers, String layEggs, String c) {
		super(feathers, layEggs);
		this.c = c;
	}	
}
