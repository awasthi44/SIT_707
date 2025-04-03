package sit707_week2;

public class Main 
{
    public static void main( String[] args )
    {
        int choice = 2;
        
        switch(choice) {
        case 1:
        	SeleniumOperations.officeworks_registration_page("https://www.officeworks.com.au/app/identity/create-account");
        	break;
        case 2:
        	SeleniumOperations.alternating_website("https://www.bunnings.com.au/register");
        	break;
        }
    }
}
