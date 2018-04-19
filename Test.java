import cs1.SimpleURLReader;
import java.util.ArrayList;
/*
 * @Author UsamaAhmed
 * Version 2/27/2018
 * Test Class
 */
public class Test 
{
  public static void main( String args[] )
  {
    //SimpleURLReader test
//    SimpleURLReader page = new SimpleURLReader( "http://www.cs.bilkent.edu.tr/~david/housman.txt" );
//    System.out.println( page.getPageContents() );
//    System.out.println( "Lines: " + page.getLineCount() );

    //MySimpleURLReader test
//    MySimpleURLReader page = new MySimpleURLReader( "http://www.cs.bilkent.edu.tr/~david/housman.txt" );
//    System.out.println( page.getPageContents() );
//    System.out.println( "Lines: " + page.getLineCount() );
//    System.out.println( "URL: " + page.getURL() );
//    System.out.println( "Name: " + page.getName() );
    
//    //MySimpleURLReader test
//    HTMLFilteredReader page = new HTMLFilteredReader( "http://www.cs.bilkent.edu.tr/~david/housman.htm" );
//    System.out.println( page.getUnfilteredPageContents() );
//    System.out.println( page.getPageContents() );
//    System.out.println( "Lines: " + page.getLineCount() );
//    System.out.println( "URL: " + page.getURL() );
//    System.out.println( "Name: " + page.getName() );
//    
//    //SuperHTMLFilteredReader test 
//    SuperHTMLFilteredReader page = new SuperHTMLFilteredReader( "http://www.cs.bilkent.edu.tr/~david/index.html" );
//    System.out.println( page.getUnfilteredPageContents() );
//    System.out.println( page.getPageContents() );
//    System.out.println( "Lines: " + page.getLineCount() );
//    System.out.println( "URL: " + page.getURL() );
//    System.out.println( "Name: " + page.getName() );
//    System.out.println( "Size Percentage Difference: " + page.getOverhead() + "%" );
//    System.out.println( );
//    System.out.println( page.getLinks() );
    SuperHTMLFilteredReader page = new SuperHTMLFilteredReader( "https://www.turkiye.gov.tr/doviz-kurlari" );
    String text = page.getPageContents();
    int count = 0;
    ArrayList<String> currencies = new ArrayList<String>();
    for ( int i = 0 ; i < text.length() - 15  ; i++ )
    {
      int j = i;
      String output = "";
      if( text.substring( i, i + 4 ).equals( "EURO" ) )
      {
        while( count < 4 )
        {
          if( text.charAt( j ) == '\n' )
          {
            count++;
            output = output + text.charAt(j);
            j++;
          }
          else
          {
            output = output + text.charAt(j);
            j++;
          }
        }
        currencies.add( output );
      }
    }
    System.out.println( currencies );
  }
}
      
                                                                         
  
