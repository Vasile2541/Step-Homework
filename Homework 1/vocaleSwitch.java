import java.io.IOException;

public class vocaleSwitch{
  public static void main(String []args)throws IOException{
    System.out.println("Verifica daca litera este vocala:");
    char charr      = (char) System.in.read();
    char upperCharr = Character.toUpperCase(charr);

    switch(upperCharr){
      case 'A': System.out.println(charr + ": Este o vocala;"); break;
      case 'E': System.out.println(charr + ": Este o vocala;"); break;
      case 'I': System.out.println(charr + ": Este o vocala;"); break;
      case 'O': System.out.println(charr + ": Este o vocala;"); break;
      case 'U': System.out.println(charr + ": Este o vocala;"); break;
      default: System.out.println(charr + ": Este o consoala;");
    }



  }
}