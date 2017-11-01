import org.testng.annotations.Test;

public class max {
  @Test
  public void f() {
	  
	  int[] cats = { 2, 5, 7, 8, 3, 0 };

		int max = 0;

		max = cats[0];

		for (int i = 1; i < cats.length; i++) {
			
			if (cats [i]>= max)
			{
				max=cats [i];
			}
		}
		
		System.out.println(max);
  }
}
