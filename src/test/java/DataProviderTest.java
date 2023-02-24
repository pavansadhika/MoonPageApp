import org.testng.annotations.Test;
import utils.DataProviderClass;

/**
 * Created by vinodkammara on 12/01/2023.
 */
public class DataProviderTest {

    @Test(dataProvider = "data-provider", dataProviderClass = DataProviderClass.class)
    public void testDataProviderMethod(String data)
    {
        System.out.println("Data is: " + data);
    }
}
