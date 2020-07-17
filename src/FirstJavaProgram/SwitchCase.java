package FirstJavaProgram;

public class SwitchCase {

	public static void main(String[] args) {
		String color ="green";
				
				switch (color) {
				case "red":
					System.out.println("color is red");
					
					break;
				case "blue":
					System.out.println("color is blue");
					
					break;
				case "green":
					System.out.println("color is green");
					
					break;
				default:
					System.out.println("no color available");
					break;
				}

	}

}
