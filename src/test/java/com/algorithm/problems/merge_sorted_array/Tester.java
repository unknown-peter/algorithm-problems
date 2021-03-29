/**
 * Leetcode - merge_sorted_array
 */
package com.algorithm.problems.merge_sorted_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.algorithm.problems.merge_sorted_array.Solution;
import com.algorithm.problems.merge_sorted_array.Solution1;

@RunWith(Parameterized.class)
public class Tester {

    /**=========================== static for every test cases ============================== */

    // Solution instance to test
    private static Solution solution;
    // use this Object to print the log (call from slf4j facade)
    private static final Logger LOGGER = LoggerFactory.getLogger(TesterRunner.class);

    /** Execute once before any of the test methods in this class. */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        /* uncomment to switch solutions */
        solution = new Solution1();
        // solution = new Solution2();
    }

    /** Execute once after all of the test methods are executed in this class. */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {}

    /** Initialize test cases */
    @Parameters
    public static Collection<Object[]> testcases() {
        return Arrays.asList(new Object[][] {
                {new int[] {1, 2, 3, 0, 0, 0}, 3, new int[] {2, 5, 6}, 3,
                        new int[] {1, 2, 2, 3, 5, 6}},
                {new int[] {4, 5, 6, 0, 0, 0}, 3, new int[] {1, 2, 3}, 3,
                        new int[] {1, 2, 3, 4, 5, 6}},
                {new int[] {2, 0}, 1, new int[] {1}, 1, new int[] {1, 2}}});
    }

    /**=========================== for each test case ============================== */

    /** 
     * Parameters for each test (initialized in testcases() method) 
     * You can change the type of parameters
     */
    private int[] para1; // parameter 1
    private int para2; // parameter 2
    private int[] para3; // parameter 3
    private int para4; // parameter 4
    private int[] expected; // parameter 5 (expected answer)

    /** This constructor must be provided to run parameterized test. */
    public Tester(int[] para1, int para2, int[] para3, int para4, int[] expected) {
        // initialize test parameters
        this.para1 = para1;
        this.para2 = para2;
        this.para3 = para3;
        this.para4 = para4;
        this.expected = expected;
    }

    /** Execute before each test method in this class is executed. */
    @Before
    public void setUp() throws Exception {}

    /** Executed as a test case. */
    @Test
    public void test() {

        solution.merge(para1, para2, para3, para4);

        assertThat(para1, is(equalTo(expected)));

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("merge() pass unit test!");
        }
    }

    /** Execute after each test method in this class is executed. */
    @After
    public void tearDown() throws Exception {}

}
