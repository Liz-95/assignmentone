package za.ac.cput.assignmentone;
//TUMELO PHELA
//215049217
//3B

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void add(){
        Calculator calcu = new Calculator();
        Assert.assertEquals(8, calcu.add(5,3));
    }
    @Test
     public void subtract(){
        Calculator calcu = new Calculator();
        Assert.assertEquals(11,calcu.subtract(22,11));

     }
    @Test
     public void multiply(){
        Calculator calcu = new Calculator();
        Assert.assertEquals(15, calcu.multiply(5,3));
     }
    @Test
     public void divide(){
        Calculator calcu = new Calculator();
        Assert.assertEquals(3, calcu.divide(21,7));
     }
}
