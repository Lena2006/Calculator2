
import static jdk.nashorn.internal.objects.Global.Infinity;
import myCode.CalculatorImp;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class CalculatorTestNG {

    private CalculatorImp calculator;

    @BeforeClass
    public void setUp() {
        calculator = new CalculatorImp();
    }

    public CalculatorTestNG(){
}

@Test
        public void zeroTest() {
double result = calculator.calculate("0");
assertEquals(result,0.0 , "Error 0!!");
    }
          @Test
    public void floatingPointTest() {
        double result =  calculator.calculate("-3000.02");
        assertEquals(result,-3000.02,  "Error floatingPoint ");
    }
    @Test
    public void addTest_1() {
        double result =  calculator.calculate("30.4/2");
        assertEquals(result,15.2,  "Error na delenie");
    }
    @Test
    public void addTest_2()  {
        double result = calculator.calculate("(2+2)*1.5/10-444");
        assertEquals(result,-443.4,  "Error na sloznie vichislenija");
         
    }
    @Test
    public void functionTest()  {
        double result = calculator.calculate("sin(1)*sin(1)+cos(1)*cos(1)");
        assertEquals(result,1,  "Error function");
    }
    @Test
    public void addTest_3()  {
        double result = calculator.calculate("1/0");
        assertEquals(result,Infinity,  "Error delenie na 0");
}
} 
