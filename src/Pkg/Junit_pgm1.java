package Pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junit_pgm1 {
	@Before
	public void browseropen()
	{
		System.out.println("open browser");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test browser");
	}
	
	@After
	public void browserclose()
	{
		System.out.println("close browser");
	}

}
