package utils;

import org.testng.annotations.DataProvider;

/**
 * Created by vinodkammara on 12/01/2023.
 */
public class DataProviderClass {

    @DataProvider(name = "data-provider")
    public static Object[][] dataProviderMethod()
    {
        return new Object[][] { { "data one" }, { "data two" } , { "data three" } };
    }
}
