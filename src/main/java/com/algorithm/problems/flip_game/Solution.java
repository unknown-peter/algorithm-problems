/**
 * Leetcode - flip_game
 */
package com.algorithm.problems.flip_game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<String> generatePossibleNextMoves(String s);
}
