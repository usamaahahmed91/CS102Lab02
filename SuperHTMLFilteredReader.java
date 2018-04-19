import cs1.SimpleURLReader;
import java.util.ArrayList;
/*
 * @Author UsamaAhmed
 * Version 2/27/2018
 * SuperHTMLFilteredReader
 */
public class SuperHTMLFilteredReader extends HTMLFilteredReader
{
  //Properties 
  private ArrayList<String> links = new ArrayList<String>();
  private int lengthUnfiltered;
  private int lengthFiltered;
  private String unfiltered;
  private String filtered;
  
  //Constructor
  /*
   * @param a string ccontaing url of the page
   * @return
   * Constructructor for SuperHTMLFilteredReader
   */
  SuperHTMLFilteredReader( String adress )
  {
    super( adress );
    unfiltered = getUnfilteredPageContents();
    filtered = getPageContents();
    lengthUnfiltered = unfiltered.length();
    lengthFiltered = filtered.length();
  }
  
  //Methods
  /*
   * @param none
   * @return percentage decrease in characters after removing html tags in double
   */
  public double getOverhead()
  {
    double difference = lengthUnfiltered - lengthFiltered;
    double percentageDifference = ( difference / lengthUnfiltered )* 100 ;
    return percentageDifference;
  }
  
  /*
   * @param none
   * @return a string containing links
   * method to get links embedded in a html page
   */
  public ArrayList<String> getLinks()
  {
    for( int i = 0 ; i < lengthUnfiltered - 5 ; i++ )
    {
      int count = 0;
      if( unfiltered.substring( i, i + 5 ).equals("href=") )
      {
        int j = i + 5;
        String page = "";
        while( count < 2 )
        {
          if( unfiltered.charAt( j ) == '"' )
          {
            j++;
            count++;
          }
          else 
          {
             page = page + unfiltered.charAt( j );
            j++;
          }
        }
        links.add( page );
      } 
    }
    return links;
  }
}
