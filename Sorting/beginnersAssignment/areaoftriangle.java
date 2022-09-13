public class Main
{

 public static void printArea(double [] X, double [] Y){
 //find area of triangle
 double area = Math.abs(X[0]*(Y[1]-Y[2]) + X[1]*(Y[2]-Y[0]) + X[2]*(Y[0]-Y[1]))/2;
 System.out.println("Area of Triangle: " + area);
 }

 public static void main(String[] args) {
 double [] x_coordinates = {1,2,5};
 double [] y_coordinates = {0, 6, 10};
 printArea(x_coordinates, y_coordinates);
 }
}
