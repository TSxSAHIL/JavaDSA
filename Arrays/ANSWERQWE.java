import java.util.*;

public class ANSWERQWE {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2, 3, 4, 5, 7);
        int totalCost = findTotalCost(arr);
        System.out.println(totalCost);
    }

    public static int findTotalCost(List<Integer> arr) {
        int totalCost = 0;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            minHeap.add(num);
            maxHeap.add(num);
        }

        while (minHeap.size() > 1) {
            int minValue = minHeap.poll();
            int maxValue = maxHeap.poll();

            int sum = minValue + maxValue;
            int diff = maxValue - minValue + 1;

            totalCost += Math.ceil((double) sum / diff);

            minHeap.add(sum);
            maxHeap.add(sum);
        }

        return totalCost;
    }
}
