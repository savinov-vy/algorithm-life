package algorithm.two;

/**
 * Вам дан целочисленный массив heights,
 * где heights[i] представляет высоту i-го столбца.
 * Вы можете выбрать любые два столбца,
 * чтобы сформировать контейнер.
 * Верните максимальное количество воды,
 * которое может вместить контейнер.
 */
public class ContainerWithWater {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,7,2,5,4,7,3,6}));
    }

    public static int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int result = 0;
        while (left < right) {
            int with = right - left;
            int hight = Math.min(heights[left], heights[right]);
            result = Math.max(result, with * hight);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}
