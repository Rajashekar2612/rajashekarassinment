public class MajorityElementFinder {
    public static int findMajorityElement(int[] arr) {
        int candidate = -1;
        int count = 0;

        // Finding the potential candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        // Verifying the potential candidate
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return candidate;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 5, 5, 5, 5};
        int result = findMajorityElement(arr);
        System.out.println(result); 
    }
}
    
