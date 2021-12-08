import java.io.IOException;

public class multiplicativeTable{
  public static void main(String []args)throws IOException{
    System.out.println("Dati un un nr de la 0 la 9:");

    byte asciiNumber  = (byte) System.in.read();//return 1 byte of info
    int randomNumber = (int)asciiNumber - 48;//'0'=48(ascii)
    //System.out.println( ((Object)randomNumber).getClass().getSimpleName() );

    for(int i=0; i<11; i++){
      int sum = randomNumber * i;
      System.out.println(randomNumber +" x "+ i +" = "+ sum);
    }
  }
}
