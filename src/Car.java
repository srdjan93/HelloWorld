
public class Car {
  int maxSpeed = 180;
  double weight = 1340.43;
  boolean isTheCarOn = false;
  String model = "Audi";
  double maxFuel = 100;
  double currentFuel = 50;
  int consumption = 5; //per 100 km
  double mileagePassed = 2000;
   
  public void printVariables() {
      System.out.println("Maksimalna brzina: " + maxSpeed);
      System.out.println("Model automobila je: " + model);
      System.out.println("Minimum goriva: " + maxFuel);
      System.out.println("Trenutna kolicina goriva: " + currentFuel);
      System.out.println(isTheCarOn);
      System.out.println(consumption);
      System.out.println(mileagePassed);
      System.out.println("Maksimalna tezina: " + weight);
  }
      
  
  
  
}
