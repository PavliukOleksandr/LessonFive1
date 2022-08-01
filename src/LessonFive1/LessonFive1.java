package LessonFive1;

public class LessonFive1 {
	public static void main(String[] args) {
		Eagle eagle = new Eagle("Got feathers", "Can lay eggs", "Predator");
		Chicken chicken = new Chicken("Got feathers", "Can lay eggs", "Not a predator");
		Penguin penguin = new Penguin("not Got feathers", "Can lay eggs", "Not a predator");
		Swallow swallow =  new Swallow("Got feathers", "Can lay eggs", "Not a Predator");
		String[] arr = new String[4];
		arr[0] = eagle.getFeathers() + " " + eagle.getLayEggs() + " " + eagle.getE();
		arr[1] = chicken.getFeathers() + " " + chicken.getLayEggs() + " " + chicken.getC();
		arr[2] = penguin.getFeathers() + " " + penguin.getLayEggs() + " "  + penguin.getP();
		arr[3] = swallow.getFeathers() + " " + swallow.getLayEggs() + " " + swallow.getS();
		for (int i = 0; i < arr.length; i++) {
			if(i==0) {
				System.out.print("Eagle ");
				eagle.fly();
			}else if(i==1) {
				System.out.print("Chicken ");
				chicken.fly();
			}else if(i==2) {
				System.out.print("Penguin ");
				penguin.fly();
			}if(i==3) {
				System.out.print("Swallow ");
				swallow.fly();
			}System.out.println(arr[i]);
		}
	}
}
