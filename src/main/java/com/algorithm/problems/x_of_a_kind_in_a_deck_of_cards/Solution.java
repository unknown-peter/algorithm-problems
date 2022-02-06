/**
 * Leetcode - x_of_a_kind_in_a_deck_of_cards
 */
package com.algorithm.problems.x_of_a_kind_in_a_deck_of_cards;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean hasGroupsSizeX(int[] deck);
}
