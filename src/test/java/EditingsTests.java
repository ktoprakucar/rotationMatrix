import operations.Editings;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by toprak on 29-Mar-17.
 */
public class EditingsTests {


  @Before
  public void setUp() {

  }

  @Test
  public void test_calculate_additional_pixels() {
    int expansion = Editings.calculateAdditionalPixelsForEachDimension(7);
    assertEquals(3, expansion);
  }

  @Test
  public void test_expand_matrix() {
    int[][] matrix = new int[5][5];
    int[][] filledMatrix = Editings.fillOutOfMatrix(7, matrix);
    assertEquals(11, filledMatrix.length);
    assertEquals(11, filledMatrix[0].length);
  }

  @Test
  public void test_fill_out_of_matrix(){
    int[][] matrix = new int [][]{
            new int [] {1,2,3,4,5},
            new int [] {1,2,3,4,5},
            new int [] {1,2,3,4,5},
            new int [] {1,2,3,4,5},
            new int [] {1,2,3,4,5}
    };
    int[][] filledMatrix = Editings.fillOutOfMatrix(7, matrix);
  }
}
