import java.util.ArrayList;
import java.util.List;

/**
 * author：jiguang on 2019/12/17 10:14
 * e-mail：jiguang@changjinglu.net
 */
class main {
    public static void main(String[] args) {

    }

    /**
     *
     * 三数字之和
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> resultOne = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; j < nums.length; j++) {
                    if (i + j + k == 0) {
                        ArrayList<Integer> mIntegers = new ArrayList<>();
                        mIntegers.add(i);
                        mIntegers.add(j);
                        mIntegers.add(k);
                        resultOne.add(mIntegers);
                    }
                }
            }
        }
        return resultOne;
    }
}
