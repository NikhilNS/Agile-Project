/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project04;

import java.sql.ResultSet;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author drasti patel
 */
public class TestCaseTest {
    
    public TestCaseTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class TestCase.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] arg = null;
        TestCase.main(arg);
     }

    /**
     * Test of PhNo method, of class TestCase.
     */
    @Test
    public void testPhNo() throws Exception {
        System.out.println("PhNo");
        ResultSet rs = null;
        }

    /**
     * Test of Email method, of class TestCase.
     */
    @Test
    public void testEmail() throws Exception {
        System.out.println("Email");
        ResultSet rs = null;
    }

    /**
     * Test of WorkPersonalPh method, of class TestCase.
     */
    @Test
    public void testWorkPersonalPh() throws Exception {
        System.out.println("WorkPersonalPh");
        ResultSet rs = null;
    }

    /**
     * Test of ResiPersonalPh method, of class TestCase.
     */
    @Test
    public void testResiPersonalPh() throws Exception {
        System.out.println("ResiPersonalPh");
        ResultSet rs = null;
    }

    /**
     * Test of ResiWorkPh method, of class TestCase.
     */
    @Test
    public void testResiWorkPh() throws Exception {
        System.out.println("ResiWorkPh");
        ResultSet rs = null;
    }

    /**
     * Test of IsNameValid method, of class TestCase.
     */
    @Test
    public void testIsNameValid() throws Exception {
        System.out.println("IsNameValid");
        ResultSet rs = null;
    }

    /**
     * Test of IsNameNotNull method, of class TestCase.
     */
    @Test
    public void testIsNameNotNull() throws Exception {
        System.out.println("IsNameNotNull");
        ResultSet rs = null;
    }
}
