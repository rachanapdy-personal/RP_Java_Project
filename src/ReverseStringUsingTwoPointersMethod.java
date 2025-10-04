public class ReverseStringUsingTwoPointersMethod {
    static void main() {
        String str = "I love Java";
        char[] arr = str.toCharArray();
        int left = 0 ;
        int right = str.length()-1;

        //Strings in Java are immutable (you can’t change them once created).
        //
        //If you try to reverse using concatenation (+),
        // a new String object is created on every iteration → very slow for large strings.
        //
        //By converting the String into a char[] (mutable array),
        // we can modify characters in place without creating new objects.



        //This technique uses two pointers:
        //
        //left starts at the beginning, right starts at the end.
        //
        //Swap characters until they meet in the middle.
        //
        //Each iteration swaps two characters at once.
        //
        //The loop runs only n/2 times (where n = string length).
        //
        //👉 So time complexity = O(n).

        //No extra memory allocation
        //
        //Apart from the char[] (which is required anyway), we don’t create additional Strings or builders.
        //
        //We only use a constant amount of extra space (temp, left, right).
        //
        //👉 So space complexity = O(1).

        while(left < right)
        {
          char temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;
          left++;
          right--;
        }
        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + new String(arr));
    }
}
