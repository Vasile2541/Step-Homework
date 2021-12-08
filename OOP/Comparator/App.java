public class App{
  public static void main(String[] args){

    NumbersComparator number = new NumbersComparator();
    double a=5.2;
    double b=9.6;

    double maxNumber = number.getMaxNumber(a, b);
    double minNumber = number.getMinNumber(a, b);

    System.out.println("Numarul Minim: "+ minNumber );
    System.out.println("Numarul Maxim: "+ maxNumber );

  }
}