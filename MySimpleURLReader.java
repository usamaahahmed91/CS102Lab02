import cs1.SimpleURLReader;
/*
 * @Author UsamaAhmed
 * Version 2/27/2018
 * MySimpleURLReader class
 */
public class MySimpleURLReader extends SimpleURLReader
{
  //Properties 
  private String url;
  
  //Constructor
  /*
   * @param a string ccontaing url of the page
   * @return
   * Constructructor for MySimpleURLReader
   */
  MySimpleURLReader( String adress )
  {
    super( adress );
    url = adress;
  }  
  
  
  //Methods
  
  /*
   * @param none
   * @return String containing url
   * A method to retrieve url
   */
  public String getURL()
  {
    return url;
  }
  
  /*
   * @param none
   * @return String containing the name of the url after the last slash
   * A method to retrieve url name
   */
  public String getName()
  {
    int i = url.length() - 1;
    String name = "";
    int location = 0;
   
    while( url.charAt( i ) != '/' )
    {
      location = i; 
      i--;
    }
    while( location < url.length() )
    {
      name = name + url.charAt( location );
      location++;
    }
    return name;
  }
  
  /*
   * @param none
   * @return String containing contents of the url
   * Override method to fix bug in orignal getPageContents() mehtod
   */
  @Override
  public String getPageContents()
  {
    String page = "";
    String newPage = "";
    page = super.getPageContents();
    for( int i = 4 ; i < page.length() - 1 ; i++ ) 
    {
      newPage = newPage + page.charAt( i );
    }
    return newPage;
  }
}
  
  
