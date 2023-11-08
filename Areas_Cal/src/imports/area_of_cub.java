package imports;

public class area_of_cub {
    void cub(float length, float width, float height) {
        float surfaceArea = 2 * (length * width + width * height + height * length);
        System.out.println("The surface area of the cuboid with dimensions (L: " + length + ", W: " + width + ", H: " + height + ") is: " + surfaceArea);
    }

    public static void main(String[] args) {
        area_of_cub cuboid = new area_of_cub();
        float length = 5.0f;
        float width = 3.0f; 
        float height = 4.0f;	
        cuboid.cub(length, width, height);
    }
}