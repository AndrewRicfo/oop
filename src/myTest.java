import org.junit.*;

public class myTest {
    @org.junit.Test
    public void someTest()
    {
        PacMan player = new PacMan(0, 20, 1, "nigga");
        Assert.assertEquals(0, player.getX());
    }

    @org.junit.Test
    public void someTest2(){
        PacMan player = new PacMan(0,13,2, "muslim");
        Assert.assertNotEquals(10, player.getY());
    }
}