/**
 * Leetcode - missing_ranges
 */
package com.algorithm.problems.missing_ranges;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

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
        return Arrays.asList(new Object[][]{
                {new int[]{0, 1, 3, 50, 75}, 0, 99, Arrays.asList("2", "4->49", "51->74", "76->99")},
                {new int[]{1, 2, 3, 4, 5}, 1, 5, Arrays.asList()},
                {new int[]{1, 5, 10, 20}, 1, 20, Arrays.asList("2->4", "6->9", "11->19")},
                {new int[]{1, 3}, 0, 5, Arrays.asList("0", "2", "4->5")},
                {new int[]{2, 3}, 0, 5, Arrays.asList("0->1", "4->5")},
                {new int[]{2, 3}, 2, 5, Arrays.asList("4->5")},
                {new int[]{0, 1, 3, 5, 2147483647}, 0, 2147483647, Arrays.asList("2", "4", "6->2147483646")},
                {new int[]{0, 1, 2147483646, 2147483647}, 0, 2147483647, Arrays.asList("2->2147483645")},
                {new int[]{0, 1, 2147483646}, 0, 2147483647, Arrays.asList("2->2147483645", "2147483647")}
        });
    }

    /**=========================== for each test case ============================== */

    /**
     * Parameters for each test (initialized in testcases() method)
     * You can change the type of parameters
     */
    private int[] para1;                       // parameter 1
    private int para2;                       // parameter 2
    private int para3;                       // parameter 3
    private List<String> expected;                    // parameter 4 (expected answer)

    /**
     * This constructor must be provided to run parameterized test.
     */
    public Tester(int[] para1, int para2, int para3, List<String> expected) {
        // initialize test parameters
        this.para1 = para1;
        this.para2 = para2;
        this.para3 = para3;
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

        Object actual = solution.findMissingRanges(para1, para2, para3);

        assertThat(actual, is(equalTo(expected)));

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("findMissingRanges() pass unit test!");
        }
    }

    /**
     * Execute after each test method in this class is executed.
     */
    @After
    public void tearDown() throws Exception {
    }

}
