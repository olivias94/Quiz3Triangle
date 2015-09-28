package Package1;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTestCases {
	

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
	}
	
	@Before
	public void setUp() throws Exception{
	}
	
	@After
	public void tearDown() throws Exception{
	}
	
	@Test
	public void testTriangle(){
		Triangle Triangle1 = new Triangle();
		assertTrue("Triangle.getPerimeter() failed", Triangle1.getPerimeter()==3.0);
		Triangle Triangle2 = new Triangle(3, 4, 5);
		assertTrue("Triangle.getArea() failed", Triangle2.getArea()==6.0);
		Triangle1.setSide2(.5);
		assertTrue("Triangle.getSide2() failed", Triangle1.getSide2()==.5);
		Triangle2.setSide1(3);
		Triangle2.setSide2(10);
		Triangle2.setSide3(11);
		assertTrue("Triangle.getArea() failed", Triangle2.getArea()==Math.sqrt(216));
	}

}
