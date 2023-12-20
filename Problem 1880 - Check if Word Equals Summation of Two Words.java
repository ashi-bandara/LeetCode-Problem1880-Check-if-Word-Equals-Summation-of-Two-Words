
class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstWordSum = calculateSum(firstWord);
        int secondWordSum = calculateSum(secondWord);
        int targetWordSum = calculateSum(targetWord);

        return (firstWordSum + secondWordSum) == targetWordSum;
    }

    private int calculateSum(String word){
        int[] intArray =  new int[word.length()];
        int sum = 0;
        int i = 0;

        for(char letter: word.toCharArray()){
            switch (letter) {
                case 'a':
                    intArray[i] = 0;
                    break;
                case 'b':
                    intArray[i] = 1;
                    break;
                case 'c':
                    intArray[i] = 2;
                    break;
                case 'd':
                    intArray[i] = 3;
                    break;
                case 'e':
                    intArray[i] = 4;
                    break;
                case 'f':
                    intArray[i] = 5;
                    break;
                case 'g':
                    intArray[i] = 6;
                    break;
                case 'h':
                    intArray[i] = 7;
                    break;
                case 'i':
                    intArray[i] = 8;
                    break;
                case 'j':
                    intArray[i] = 9;
                    break;
            }
            i++;
        }

        for (int j : intArray) {
            sum = (sum * 10) + j;
        }
        return sum;
    }
}