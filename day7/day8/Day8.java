package com.yoki.advent_of_code.aoc.days2022;

import com.yoki.advent_of_code.aoc.AocDay;
import com.yoki.advent_of_code.utils.CollectionUtil;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class Day8 extends AocDay {

  private final TreeGrid grid;

  /**
   * Prepare/parse the input in preparation for running the parts.
   *
   * @param input  the entire problem input as downloaded
   * @param output any display/debug output will be sent to output
   */
  public Day8(String input, PrintStream output) {
    super(input, output);
    this.grid = new TreeGrid(this.input);
  }

  public String part1() {
    return String.valueOf(this.grid.countVisibleTree());
  }

  public String part2() {
    return String.valueOf(this.grid.bestScenicScore());
  }

  private static class TreeGrid {

    private final int size;
    private final int[][] grid;

    public TreeGrid(String input) {
      List<String> inputs = input.lines().toList();
      size = inputs.size();
      grid = new int[size][size];
      for (var l : CollectionUtil.enumerate(inputs)) {
        grid[l.index()] = Arrays.stream(l.item().split("")).mapToInt(Integer::parseInt).toArray();
      }
    }

    public int bestScenicScore() {
      int max = 0;
      for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
          max = Math.max(max, scenicScore(i, j));
        }
      }
      return max;
    }

    private int scenicScore(int x, int y) {
      int n = this.grid[x][y];
      return scoreDown(x, y, n) * scoreUp(x, y, n) * scoreLeft(x, y, n) * scoreRight(x, y, n);
    }

    private int scoreUp(int x, int y, int n) {
      int c = 0;
      for (int i = x - 1; i >= 0; i--) {
        c++;
        if (this.grid[i][y] >= n) break;
      }
      return c;
    }

    private int scoreDown(int x, int y, int n) {
      int c = 0;
      for (int i = x + 1; i < size; i++) {
        c++;
        if (this.grid[i][y] >= n) break;
      }
      return c;
    }

    private int scoreLeft(int x, int y, int n) {
      int c = 0;
      for (int i = y - 1; i >= 0; i--) {
        c++;
        if (this.grid[x][i] >= n) break;
      }
      return c;
    }

    private int scoreRight(int x, int y, int n) {
      int c = 0;
      for (int i = y + 1; i < size; i++) {
        c++;
        if (this.grid[x][i] >= n) break;
      }
      return c;
    }

    public int countVisibleTree() {
      int res = 0;
      for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
          if (isVisible(i, j)) res++;
        }
      }
      return res;
    }

    private boolean isVisible(int x, int y) {
      int n = this.grid[x][y];
      boolean left = visibleY(0, y, x, n);
      boolean right = visibleY(y + 1, this.size, x, n);
      boolean up = visibleX(0, x, y, n);
      boolean down = visibleX(x + 1, this.size, y, n);
      return up || down || left || right;
    }

    private boolean visibleX(int from, int to, int y, int val) {
      for (int i = from; i < to; i++) {
        if (this.grid[i][y] >= val) return false;
      }
      return true;
    }

    private boolean visibleY(int from, int to, int x, int val) {
      for (int i = from; i < to; i++) {
        if (this.grid[x][i] >= val) return false;
      }
      return true;
    }

    @Override
    public String toString() {
      return Arrays.deepToString(grid);
    }
  }
}
