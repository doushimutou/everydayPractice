package com.averyday.demo.suanfa;

/**
 * Description
 * Author ayt  on
 * 深度搜索问题
 * 总结：遇到向上向下向左向右问题时候，首先想到要用
 */
public class DeepSearch {
	int m, n, k;

	public int movingCount(int m, int n, int k) {
		this.m = m;
		this.n = n;
		this.k = k;
		//标记访问过的位置
		boolean[][] visited = new boolean[m][n];
		return dfs(0, 0, 0, visited);
	}


	public static int sum(int i, int j) {
		int sum = 0;
		while (i > 0) {
			sum = sum + i % 10;
			i = i / 10;
		}
		while (j > 0) {
			sum = sum + j % 10;
			j = j / 10;
		}
		return sum;
	}

	public int dfs(int i, int j, int sum, boolean[][] visited) {
		if (i == n || j == m || sum > k || visited[i][j]) {
			return 0;
		}
		visited[i][j] = true;
		return 1 + dfs(i + 1, j, sum(i + 1, j), visited) + dfs(i, j + 1, sum(i, j + 1), visited);

	}
}
