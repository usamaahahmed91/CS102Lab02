import cs1.SimpleURLReader;
/*
 * @Author UsamaAhmed
 * Version 2/27/2018
 * HTMLFilteredReader class
 */
public class HTMLFilteredReader extends MySimpleURLReader
{
  //Properties 
  private int lengthUnfiltered;
  private String unfiltered;
  
  
  //Constructor
  /*
   * @param a string ccontaing url of the page
   * @return 
   * Constructor for HTMLFilteredReader
   */
  HTMLFilteredReader( String adress )
  {
    super( adress );
    unfiltered = getUnfilteredPageContents();
    lengthUnfiltered = unfiltered.length();
  }
  
  //Methods
  /*
   * @param none
   * @return String containing page contents inculding including html tags
   * Method to output page contents
   */
  public String getUnfilteredPageContents()
  {
    String output = "";
    output = super.getPageContents();
    return output;
  }
  
  /*
   * @param none
   * @return String containing contents of the url excluding html tags
   * Override method to return output string without html tags
   */
  @Override
  public String getPageContents()
  {
    int a = 0;
    String output = "";
    int i = 0 ;
    while (  i < lengthUnfiltered ) {
      if ( unfiltered.charAt(i) == '<') {
        a = i;
        while ( unfiltered.charAt( a ) != '>' )
        {
          a++;
        }
        i = a;
      }
      if ( unfiltered.charAt( i ) == '>' )
      {
        i++;
      }
      else
      {
        output = output + unfiltered.charAt( i );
        i++;
      }
    }
    return output; 
  }
}