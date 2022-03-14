public class BasicCalculator {

  public Calculator() {

  }

  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public int divide(int a, int b) {
    return a / b;
  }

  public int modulo(int a, int b) {
    return a % b;
  }


  public static void main(String[] args) {

    Calculator myCalculator = new Calculator();

    // add
    System.out.println(myCalculator.add(5, 5));
    // subtract
    System.out.println(myCalculator.subtract(12, 7));
    // multiply
    System.out.println(myCalculator.multiply(2, 5));
    // divide 
    System.out.println(myCalculator.divide(12, 6));




  }

}