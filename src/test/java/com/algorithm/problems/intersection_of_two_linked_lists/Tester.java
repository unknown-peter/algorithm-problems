/**
 * Leetcode - intersection_of_two_linked_lists
 */
package com.algorithm.problems.intersection_of_two_linked_lists;

import com.algorithm.util.ListNodeConvertClass;
import com.ciaoshen.leetcode.util.ListNode;
import org.apache.commons.lang3.tuple.Triple;
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
        solution = new Solution3();
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
                {8, "[4,1,8,4,5]", "[5,6,1,8,4,5]", 2, 3},
                {2, "[1,9,1,2,4]", "[3,2,4]", 3, 1},
                {0, "[2,6,4]", "[1,5]", 3, 2}
        });
    }

    /**=========================== for each test case ============================== */

    /**
     * Parameters for each test (initialized in testcases() method)
     * You can change the type of parameters
     */
    private int para1;                       // parameter 1
    private String para2;                       // parameter 2
    private String para3;                       // parameter 3
    private int para4;                       // parameter 4
    private int para5;                       // parameter 5
    // private Object expected;                    // parameter 3 (expected answer)

    /**
     * This constructor must be provided to run parameterized test.
     */
    public Tester(int para1, String para2, String para3, int para4, int para5) {
        // initialize test parameters
        this.para1 = para1;
        this.para2 = para2;
        this.para3 = para3;
        this.para4 = para4;
        this.para5 = para5;
        //     this.expected = expected;
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

        Triple<ListNode, ListNode, ListNode> result = ListNodeConvertClass.intersectionListNodes(para1, para2, para3,
                para4, para5);
        Object actual = solution.getIntersectionNode(result.getLeft(), result.getMiddle());

        assertThat(actual, is(equalTo(result.getRight())));

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("getIntersectionNode() pass unit test!");
        }
    }

    /**
     * Execute after each test method in this class is executed.
     */
    @After
    public void tearDown() throws Exception {
    }

}
