public class MyGeometry {

public static void drawLine(int length) {
		for(int i = 0; i < length; i++) {
			  System.out.print("*");
		}
		
    System.out.println("");
}

public static void drawRectangle(int length, int width) {
		for(int i = 0; i < length; i++) {
			  drawLine(width);
		}
}

}
