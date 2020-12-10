import fooBar.FooBar;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FooBar3Test {
    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void testString() {
        FooBar.getResult3(15);
        String s1="1"+System.lineSeparator()+"2"+System.lineSeparator()+"Foo"+System.lineSeparator()+
                "4"+System.lineSeparator()+ "Bar"+System.lineSeparator()+ "Foo"+System.lineSeparator()+
                "7"+System.lineSeparator()+ "8"+System.lineSeparator()+ "Foo"+System.lineSeparator()+
                "Bar"+System.lineSeparator()+ "11"+System.lineSeparator()+ "Foo"+System.lineSeparator()+
                "13"+System.lineSeparator()+ "14"+System.lineSeparator()+ "FooBar"+System.lineSeparator();
        Assert.assertEquals(s1, output.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}
