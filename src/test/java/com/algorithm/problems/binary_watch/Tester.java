/**
 * Leetcode - binary_watch
 */
package com.algorithm.problems.binary_watch;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

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
        solution = new Solution4();
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
                {1, Arrays.asList("0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00", "8:00")},
                {9, Arrays.asList()},
                {6, Arrays.asList("1:31", "1:47", "1:55", "1:59", "2:31", "2:47", "2:55", "2:59", "3:15", "3:23", "3:27", "3:29", "3:30", "3:39", "3:43", "3:45", "3:46", "3:51", "3:53", "3:54", "3:57", "3:58", "4:31", "4:47", "4:55", "4:59", "5:15", "5:23", "5:27", "5:29", "5:30", "5:39", "5:43", "5:45", "5:46", "5:51", "5:53", "5:54", "5:57", "5:58", "6:15", "6:23", "6:27", "6:29", "6:30", "6:39", "6:43", "6:45", "6:46", "6:51", "6:53", "6:54", "6:57", "6:58", "7:07", "7:11", "7:13", "7:14", "7:19", "7:21", "7:22", "7:25", "7:26", "7:28", "7:35", "7:37", "7:38", "7:41", "7:42", "7:44", "7:49", "7:50", "7:52", "7:56", "8:31", "8:47", "8:55", "8:59", "9:15", "9:23", "9:27", "9:29", "9:30", "9:39", "9:43", "9:45", "9:46", "9:51", "9:53", "9:54", "9:57", "9:58", "10:15", "10:23", "10:27", "10:29", "10:30", "10:39", "10:43", "10:45", "10:46", "10:51", "10:53", "10:54", "10:57", "10:58", "11:07", "11:11", "11:13", "11:14", "11:19", "11:21", "11:22", "11:25", "11:26", "11:28", "11:35", "11:37", "11:38", "11:41", "11:42", "11:44", "11:49", "11:50", "11:52", "11:56")}      // test case 3 (init parameters below: {para1, para2, expected})
        });
    }

    /**=========================== for each test case ============================== */

    /**
     * Parameters for each test (initialized in testcases() method)
     * You can change the type of parameters
     */
    private int para1;                       // parameter 1
    private List<String> expected;                    // parameter 3 (expected answer)

    /**
     * This constructor must be provided to run parameterized test.
     */
    public Tester(int para1, List<String> expected) {
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

        List<String> actual = solution.readBinaryWatch(para1);

        assertTrue(actual.stream().sorted().collect(Collectors.joining())
                .equals(expected.stream().sorted().collect(Collectors.joining())));

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("readBinaryWatch() pass unit test!");
        }
    }

    /**
     * Execute after each test method in this class is executed.
     */
    @After
    public void tearDown() throws Exception {
    }

}
