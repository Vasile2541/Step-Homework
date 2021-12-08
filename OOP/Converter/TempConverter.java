public class TempConverter{

  public static void convertToFahr( double celsius ){
    double fahr  = (celsius * 1.8) + 32;
    double fahr1 = (celsius * 9/5) + 32;

    System.out.println( celsius+" °C --→ "+fahr  +" °F" );
    System.out.println( celsius+" °C --→ "+fahr1 +" °F" );
  }

  public static void convertToCelsius( double fahr ){
    double celsius  = ( fahr - 32 ) / 1.8;
    double celsius1 = ( fahr - 32 ) * 5/9;

    System.out.println( fahr+" °F --→ "+celsius +" °C" );
    System.out.println( fahr+" °F --→ "+celsius1+" °C" );

  }

}