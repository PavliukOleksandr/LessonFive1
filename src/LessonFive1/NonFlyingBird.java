package LessonFive1;

public class NonFlyingBird extends Bird {

	public NonFlyingBird(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public void fly() {
		System.out.println("Can't fly");
	}
}
