public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI  * radius;
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }
    public static double getBaseArea(int radius){
        double baseArea = Math.PI * radius * radius;
        return baseArea;
    }
    public static double getPerimeter(int radius){
        double perimeter = 2 * Math.PI  * radius;
        return perimeter;
    }
}
