class Solution {
    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = (char) temp;
            left++;
            right--;
        }
    }

    public String reverseWords(String s) {
        char[] arr = s.toCharArray();// [M,r, ,D,i,n,g]
        int start = 0;
        for (int end = 0; end <= arr.length; end++) {
            if (end == arr.length || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }
        return new String(arr);
    }
}