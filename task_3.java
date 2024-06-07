@RunWith(Parameterized.class)
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
    this.age = age;
    this.result = result;
  }

  @Parameterized.Parameters
  public static Object[][] getTextData() {
    return new Object[][] {
       // совершеннолетие наступает в 18 лет
      {18, true},
      {19, true}, // совершеннолетие наступает в 21 год
      {20, true},
      {21, true},
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(age);
    assertEquals("Incorrect result for age " + age, result, isAdult);
  }
}