class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // create 3 dogs
    Dog dog1 = new Dog("Husky", "1", "Gohan");
    Dog dog2 = new Dog("Pug", "2", "Ellie",);
    Dog dog3 = new Dog("Pomeranian", "3", "Kong");

    // display object property values
    print(gohan.breed);
    print(ellie.age);
    print(kong.name);
    // invoke object behaviors(functions)
    ellie.bark();
    kong.bark();   
    
    // invoke object behaviors(functions)
   
    
  }

  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }

}