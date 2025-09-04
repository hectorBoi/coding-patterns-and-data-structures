public class Main {

    private static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length()-1;
        while(left<right){
            if(word.charAt(left) != word.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main (String[] args) {
        String[] words = new String[] {"aba", "abba", "a", "not"};
        for(String word: words){
            System.out.println("Is '" +word+"' palindorme? " + isPalindrome(word));
        }
    }
}
