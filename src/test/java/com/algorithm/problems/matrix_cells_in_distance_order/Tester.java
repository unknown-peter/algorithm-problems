/**
 * Leetcode - matrix_cells_in_distance_order
 */
package com.algorithm.problems.matrix_cells_in_distance_order;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Collection;

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
                {1, 2, 0, 0, new int[][]{{0, 0}, {0, 1}}},
                {2, 2, 0, 1, new int[][]{{0, 1}, {0, 0}, {1, 1}, {1, 0}}},
                {2, 3, 1, 2, new int[][]{{1, 2}, {0, 2}, {1, 1}, {0, 1}, {1, 0}, {0, 0}}}
        });
    }

    /**=========================== for each test case ============================== */

    /**
     * Parameters for each test (initialized in testcases() method)
     * You can change the type of parameters
     */
    private int para1;                       // parameter 1
    private int para2;                       // parameter 2
    private int para3;                       // parameter 3
    private int para4;                       // parameter 4
    private int[][] expected;                // parameter 5 (expected answer)

    /**
     * This constructor must be provided to run parameterized test.
     */
    public Tester(int para1, int para2, int para3, int para4, int[][] expected) {
        // initialize test parameters
        this.para1 = para1;
        this.para2 = para2;
        this.para3 = para3;
        this.para4 = para4;
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

        Object actual = solution.allCellsDistOrder(para1, para2, para3, para4);

        assertThat(actual, is(equalTo(expected)));

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("allCellsDistOrder() pass unit test!");
        }
    }

    /**
     * Execute after each test method in this class is executed.
     */
    @After
    public void tearDown() throws Exception {
    }

}
