/**
 * Leetcode - permutations
 */
package com.algorithm.problems.permutations;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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

import com.algorithm.util.AssertClass;

@RunWith(Parameterized.class)
public class Tester {

    /**
     * =========================== static for every test cases ==============================
     */

    // Solution instance to test
    private static Solution solution;
    // use this Object to print the log (call from slf4j facade)
    private static final Logger LOGGER = LoggerFactory.getLogger(TesterRunner.class);

    /**
     * Execute once before any of the test methods in this class.
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        /* uncomment to switch solutions */
        //        solution = new Solution1();
        solution = new Solution2();
    }

    /**
     * Execute once after all of the test methods are executed in this class.
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * Initialize test cases
     */
    @Parameters
    public static Collection<Object[]> testcases() {
        return Arrays.asList(new Object[][] {
                {new int[] {1, 2, 3},
                        Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(1, 3, 2), Arrays.asList(2, 1, 3),
                                Arrays.asList(2, 3, 1), Arrays.asList(3, 1, 2), Arrays.asList(3, 2, 1))},
                {new int[] {0, 1}, Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 0))},
                {new int[] {1}, Arrays.asList(Arrays.asList(1))}
        });
    }

    /**=========================== for each test case ============================== */

    /**
     * Parameters for each test (initialized in testcases() method)
     * You can change the type of parameters
     */
    private int[] para1;                       // parameter 1
    private List<List<Integer>> expected;                    // parameter 2 (expected answer)

    /**
     * This constructor must be provided to run parameterized test.
     */
    public Tester(int[] para1, List<List<Integer>> expected) {
        // initialize test parameters
        this.para1 = para1;
        this.expected = expected;
    }

    /**
     * Execute before each test method in this class is executed.
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     * Executed as a test case.
     */
    @Test
    public void test() {

        List<List<Integer>> actual = solution.permute(para1);

        assertTrue(AssertClass.isSameElementListList(actual, expected));
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("permute() pass unit test!");
        }
    }

    /**
     * Execute after each test method in this class is executed.
     */
    @After
    public void tearDown() throws Exception {
    }

}
