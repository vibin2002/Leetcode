class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.toUpperCase().equals(word) || word.toLowerCase().equals(word))
            return true;
        if(Character.isUpperCase(word.charAt(0))){
            return (word.substring(1).toLowerCase()).equals(word.substring(1));
        }
        return false;
    }
}