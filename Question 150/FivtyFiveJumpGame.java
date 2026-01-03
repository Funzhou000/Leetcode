public class FivtyFiveJumpGame {
    public static void main(String[] args) {
        int[] nums = { 2, 1, 0, 1, 0 };
        // 题目You are given an integer array nums. You are initially positioned at the
        // array's first index, and each element in the array represents your maximum
        // jump length at that position.
        // Return true if you can reach the last index, or false otherwise.
        // https://leetcode.cn/problems/jump-game/description/?envType=study-plan-v2&envId=top-interview-150
        // 贪心算法
        // 维护一个变量maxReach，表示当前能够到达的最远位置
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                System.out.println("不能到达最后一个位置");
                System.exit(0);
            }
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        System.out.println("可以到达最后一个位置");
    }
}
