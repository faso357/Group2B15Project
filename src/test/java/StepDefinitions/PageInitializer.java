package StepDefinitions;

import Pages.LoginPage;
import net.bytebuddy.asm.Advice;

import java.sql.Driver;

public class PageInitializer {

    public static LoginPage login;

    public static void PageObjectInitializer(){

        login = new LoginPage();
    }
}
