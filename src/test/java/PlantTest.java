import org.junit.Assert;
import org.junit.Test;

public class PlantTest {
    @Test
    public void getNameAppleTest() {
        Plant apple = new Apple();
        Assert.assertEquals(apple.getName(), "Apple");
    }

    @Test
    public void getNameRoseTest() {
        Plant rose = new Rose();
        Assert.assertEquals(rose.getName(), "Rose");
    }

    @Test
    public void getNameCompositeTest() {
        Rosaceae rosaceae = new Rosaceae();
        rosaceae.addPlant(new Apple());
        rosaceae.addPlant(new Rose());
        Assert.assertEquals(rosaceae.getName(), "AppleRose");
    }
}