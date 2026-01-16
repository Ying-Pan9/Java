class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    // create objects
    Car myTesla = ("Tesla","Model X", "White", "2016", "90000");  
    Car myVolkswagen = ("Volkswagen", "Atlas", "2018", "30750");

    // display brand, model and value of each car
    print("Brand: " + myTesla.brand );
    print("Model: " + myTesla.model );
    print("Value: $" + myTesla.value );
    print("\n");
    print("Brand: " + myVolkswagen.brand );
    print("Model: " + myVolkswagen.model );
    print("Value: $" + myVolkswagen.value );    


    // Display brand and model of any car with value over 30,000
    print("\nCars with value exceeding $30,000:");

    if (myTesla.value > 30000){
      print("Brand: " + myTesla.brand );
      print("Model: " + myTelsa.model );
    } 
    if (myVolkswagen.value > 30000){
      print("Brand: " + myif (myVolkswagen.value > 30000){
      print("Brand: " + myVolkswagen.brand );
      print("Model: " + myVolkswagen.model );
      }
	// Make BMW honk
	print("\nUsing car functions(behavior):");	

    if (myTesla.value > 30000){
      print("Brand: " + myTesla.brand );
      print("Model: " + myTesla.model );
    } 
    if (myVolkswagen.value > 30000){
      print("Brand: " + myVolkswagen.brand );
      print("Model: " + myVolkswagen.model );
    
  }

}