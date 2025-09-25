
class Reverse_String {
    public String reverseString(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Reverse_String obj = new Reverse_String();
        String input = "Hello, World!";
        String result = obj.reverseString(input);
        System.out.println("Reversed String: " + result);
    }
}