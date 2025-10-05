class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  //1: printing a string
  void print(String s){
    System.out.println(s);
  }

  //2: Fahrenheit to Celsius temperature conversion
 double FtoC(double F){
    double C = (F - 32)*5/9.0;
    return C;
 }

  //3: Sphere volume
double sphereVolume(double radius){
    double V = (Math.PI*(Math.pow(radius,3)));
    System.out.println("Volume of sphere radius "+ radius+ " is "+ V);
    return V;
}
  //4: Cone volume
double coneVolume(double radius1, double h){
    double V1 = (Math.PI*(Math.pow( radius1,2)*(h/3.0)));
    System.out.println("Volume of sphere radius "+ radius1+ " and height "+ h + " "+ " is "+ V1);
    return V1;

  //5: Distance between two coordinate points
double distance(double x1, double x2, double y1, double y2) {
    double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    System.out.println("Distance between " + x2 + "," + y2 + " and " + x1 + "," + y1 + " is " + d);
    return d;


  
  void init(){
    //1
    System.out.println("Enter your name");
    String name = Input.readString();
    print("Welcome "+ name);

    //2
    System.out.println("Enter a temperature in deg. Fahrenheit")
    double F = Input.readDouble();
    System.out.println("Temp in deg. C is " + FtoAC(F));
  
    //3
    System.out.println("")
    //4

    //5
    
    
  }
 
}