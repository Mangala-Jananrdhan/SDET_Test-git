package login;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginUserFlowTest {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("==beforeMethod");
        System.out.println("Open Browser");
        System.out.println("Navigate to url");

    }

    @Test
    public static void verify_Login_With_Valid_Credentials(){

    }
}
