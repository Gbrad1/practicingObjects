class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    PezDispenser dispenser1 = new PezDispenser("Rick", "Yellow", true);

    System.out.println("This dispenser is " + dispenser1.getTheCharacter() +
    ", the color is " + dispenser1.getColor() + " and the in production status is:"
    + dispenser1.getInProduction());
  }
}
