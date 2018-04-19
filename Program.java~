import cs1.SimpleURLReader;
import java.util.Scanner;
import java.util.ArrayList;
/*
 * @Author UsamaAhmed
 * Version 2/27/2018
 * Program
 */
public class Program
{
  public static void main( String args[] )
  {
    Scanner scan = new Scanner(System.in);
    //Variables
    int input;
    String input2;
    int input3;
    ArrayList<SuperHTMLFilteredReader> poems;
    
    //ProgramCode
    input = 0;
    input2 = "";
    input3 = 0;
    poems = new ArrayList<SuperHTMLFilteredReader>();
    while( input != 3 )
    {
      System.out.println( "(1) Enter the url of poem to add to collection." );
      System.out.println( "(2) List all poems in the collection." );
      System.out.println( "(3) Quit." );
      System.out.print( "Select an option:" );
      input = scan.nextInt();
      if( input == 1 )
      {
        System.out.println( "Enter URL: " );
        input2 = scan.next();
        SuperHTMLFilteredReader page = new SuperHTMLFilteredReader( input2 );
        poems.add( page );
      }
      if( input == 2 )
      {
        while( input3 != ( poems.size() + 1 ) )
        {
          for( int i = 0 ; i < poems.size() ; i++ )
          {
            System.out.println( ( i + 1 ) + ". " + poems.get( i ).getName() );
          }
          System.out.print( "Enter the poem you want to view: " );
          input3 = scan.nextInt();
          if( input3 <= poems.size() )
          {
            System.out.print( poems.get( input3 - 1).getPageContents() );
          }
        }
      }
    }
  }
}