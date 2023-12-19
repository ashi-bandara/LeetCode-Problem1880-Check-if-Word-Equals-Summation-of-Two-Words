class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstWordSum = calculateSum(firstWord);
        int secondWordSum = calculateSum(secondWord);
        int targetWordSum = calculateSum(targetWord);

        return firstWordSum + secondWordSum >= targetWordSum;
    }

    private int calculateSum(String word){
        int sum = 0;
        for(char i: word.toCharArray()){
            switch (i) {
                case 'a':
                    break;
                case 'b':
                    sum = sum + 1;
                    break;
                case 'c':
                    sum = sum + 2;
                    break;
                case 'd':
                    sum = sum + 3;
                    break;
                case 'e':
                    sum = sum + 4;
                    break;
                case 'f':
                    sum = sum + 5;
                    break;
                case 'g':
                    sum = sum + 6;
                    break;
                case 'h':
                    sum = sum + 7;
                    break;
                case 'i':
                    sum = sum + 8;
                    break;
                case 'j':
                    sum = sum + 9;
                    break;
            }
        }
        return sum;
    }
}