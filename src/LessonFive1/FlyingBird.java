package LessonFive1;

public class FlyingBird extends Bird {
	
	public FlyingBird(String feathers, String layEggs) {
		super(feathers, layEggs);		
	}

	@Override
	public void fly() {
		System.out.println("Can fly");
	}
}
