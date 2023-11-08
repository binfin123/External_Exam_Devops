package imports;

public class area_circle {
    void circle(float radius) {
       
        float area = (float) (Math.PI * radius * radius);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }

    public static void main(String[] args) {
        area_circle circle = new area_circle();
        float radius = 5.0f; 
        circle.circle(radius);
    }
}
