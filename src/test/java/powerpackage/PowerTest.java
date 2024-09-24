package powerpackage;


import org.junit.Test;

public class PowerTest {
    @Test
    public void oneRaisedToOneIsOne() {
        assert PowerFinder.calculatePower(1,1) == 1;
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        assert PowerFinder.calculatePower(2,1) == 2;
    }

    @Test
    public void twoRaisedToPowerTwoIsFour() {
        assert PowerFinder.calculatePower(2, 2) == 4;
    }

    @Test
    public void threeRaisedToPowerTwoIsNine() {
        assert PowerFinder.calculatePower(3, 2) == 9;
    }
}
