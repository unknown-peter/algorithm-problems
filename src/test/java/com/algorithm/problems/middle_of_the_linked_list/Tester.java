/**
 * Leetcode - middle_of_the_linked_list
 */
package com.algorithm.problems.middle_of_the_linked_list;

import com.algorithm.util.ListNodeConvertClass;
import com.ciaoshen.leetcode.util.ListNode;
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
        solution = new Solution1();
        // solution = new Solution2();
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
                {"[1,2,3,4,5]", "[3,4,5]"},
                {"[1,2,3,4,5,6]", "[4,5,6]"}
        });
    }

    /**=========================== for each test case ============================== */

    /**
     * Parameters for each test (initialized in testcases() method)
     * You can change the type of parameters
     */
    private String para1;                       // parameter 1
    private String expected;                    // parameter 2 (expected answer)

    /**
     * This constructor must be provided to run parameterized test.
     */
    public Tester(String para1, String expected) {
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

        ListNode actual = solution.middleNode(ListNodeConvertClass.stringToListNode(para1));

        assertThat(ListNodeConvertClass.listNodeToString(actual), is(equalTo(expected)));

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("middleNode() pass unit test!");
        }
    }

    /**
     * Execute after each test method in this class is executed.
     */
    @After
    public void tearDown() throws Exception {
    }

}
