import operations.Calculations;
import operations.RotationMatrix;
import org.junit.Before;
import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by toprak on 3/13/2017.
 */
public class ComputerVisionTest {
    File leffe;

    @Before
    public void setUp(){
      leffe = new File(ComputerVisionTest.class.getClassLoader().getResource("leffe.jpg").getFile());
    }
    @Test
    public void test_calculate_hypotenuse(){
        double hypotenuse = Calculations.calculateHypotenuse(3, 4);
        assertEquals(hypotenuse, 5.0);
    }


    @Test
    public void test_rotate_from_center() throws IOException, InterruptedException {

        BufferedImage img = ImageIO.read(leffe);
        RotationMatrix app = new RotationMatrix(img, "center");
        app.rotate(45);
        app.displayImage();
        //Thread.sleep(100000);
    }

    @Test
    public void test_rotate_from_corner() throws IOException, InterruptedException {

        BufferedImage img = ImageIO.read(leffe);
        RotationMatrix app = new RotationMatrix(img, "corner");
        app.rotate(45);
        app.displayImage();
        //Thread.sleep(100000);
    }
}
