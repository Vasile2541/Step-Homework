import java.io.IOException;

public class randomNWhile{
  public static void main(String []args)throws IOException{
    System.out.println("Dati un un nr de la 0 la 9:");

    byte asciiNumber  = (byte) System.in.read();//return 1 byte of info
    int randomNumber = (int)asciiNumber - 48;//'0'=48(ascii)
    //System.out.println( ((Object)randomNumber).getClass().getSimpleName() );

    int iterator = 1;//suma doar la numere intregi
    int sum=0;
    while( iterator <=  randomNumber ){
      sum = sum + iterator;
      iterator++;
    }
      System.out.println("Suma primelor "+randomNumber+" numere intregi este:: "+sum+";");
  }
}
