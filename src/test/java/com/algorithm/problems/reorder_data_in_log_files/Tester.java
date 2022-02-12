/**
 * Leetcode - reorder_data_in_log_files
 */
package com.algorithm.problems.reorder_data_in_log_files;

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
                {new String[]{"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"},
                        new String[]{"let1 art can", "let3 art zero", "let2 own kit dig", "dig1 8 1 5 1", "dig2 3 6"}},
                {new String[]{"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"},
                        new String[]{"g1 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1", "zo4 4 7"}},
                {new String[]{"dig1 8 1 5 1", "let4 art can", "dig2 3 6", "let2 own kit dig", "let3 art can"},
                        new String[]{"let3 art can", "let4 art can", "let2 own kit dig", "dig1 8 1 5 1", "dig2 3 6"}}
        });
    }

    /**=========================== for each test case ============================== */

    /**
     * Parameters for each test (initialized in testcases() method)
     * You can change the type of parameters
     */
    private String[] para1;                       // parameter 1
    private String[] expected;                    // parameter 2 (expected answer)

    /**
     * This constructor must be provided to run parameterized test.
     */
    public Tester(String[] para1, String[] expected) {
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

        Object actual = solution.reorderLogFiles(para1);

        assertThat(actual, is(equalTo(expected)));

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("reorderLogFiles() pass unit test!");
        }
    }

    /**
     * Execute after each test method in this class is executed.
     */
    @After
    public void tearDown() throws Exception {
    }

}
