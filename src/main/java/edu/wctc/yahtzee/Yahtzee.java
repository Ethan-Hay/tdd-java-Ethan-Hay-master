package edu.wctc.yahtzee;


public class Yahtzee {
    public static void main(String[] args) {
        int hand[] = new int[]{6,6,6,6,6};
        yahtzee(hand);
    }

    public static String yahtzee(int[] hand)
    {
        int countOnes = 0;
        int countTwos = 0;
        int countThrees = 0;
        int countFours = 0;
        int countFives = 0;
        int countSixes = 0;

        for(int i = 0; i < 5; i++)
        {
            if(hand[i] == 1)
            {
                countOnes ++;
            }
            else if(hand[i] == 2)
            {
                countTwos ++;
            }
            else if(hand[i] == 3)
            {
                countThrees ++;
            }
            else if(hand[i] == 4)
            {
                countFours ++;
            }
            else if(hand[i] == 5)
            {
                countFives ++;
            }
            else
            {
                countSixes ++;
            }
        }
        if(countOnes == 5 || countTwos == 5 || countThrees == 5 || countFours == 5 || countFives == 5 || countSixes == 5)
        {
            return "Yahtzee";
        }
        else if(countOnes < 2 && countTwos < 2 && countThrees < 2 && countFours < 2 && countFives < 2 && countSixes < 2)
        {
            return "One of a kind";
        }
        else if(countOnes == 3 && countTwos ==2 || countOnes == 3 && countThrees ==2 ||countOnes == 3 && countFours ==2 ||countOnes == 3 && countFives ==2 ||countOnes == 3 && countSixes == 2 ||countTwos == 3 && countOnes ==2 ||countTwos == 3 && countThrees ==2 ||countTwos == 3 && countFours ==2 ||countTwos == 3 && countFives ==2 ||countTwos == 3 && countSixes ==2 ||countThrees == 3 && countOnes ==2 ||countThrees == 3 && countTwos ==2 ||countThrees == 3 && countFours ==2 ||countThrees == 3 && countFives ==2 ||countThrees == 3 && countSixes ==2 ||countFours == 3 && countOnes ==2 ||countFours == 3 && countTwos ==2 ||countFours == 3 && countThrees ==2 ||countFours == 3 && countFives ==2 ||countFours == 3 && countSixes ==2 ||countFives == 3 && countOnes ==2 ||countFives == 3 && countTwos ==2 ||countFives == 3 && countThrees ==2 ||countFives == 3 && countFours ==2 ||countFives == 3 && countSixes ==2 || countSixes == 3 && countOnes ==2 ||countSixes == 3 && countTwos ==2 ||countSixes == 3 && countThrees ==2 ||countSixes == 3 && countFours ==2 ||countSixes == 3 && countFives ==2 )
        {
            return "Full house";
        }
        else if(countOnes == 2 && countTwos ==2 || countOnes == 2 && countThrees ==2 ||countOnes == 2 && countFours ==2 ||countOnes == 2 && countFives ==2 ||countOnes == 2 && countSixes == 2 ||countTwos == 2 && countOnes ==2 ||countTwos == 2 && countThrees ==2 ||countTwos == 2 && countFours ==2 ||countTwos == 2 && countFives ==2 ||countTwos == 2 && countSixes ==2 ||countThrees == 2 && countOnes ==2 ||countThrees == 2 && countTwos ==2 ||countThrees == 2 && countFours ==2 ||countThrees == 2 && countFives ==2 ||countThrees == 2 && countSixes ==2 ||countFours == 2 && countOnes ==2 ||countFours == 2 && countTwos ==2 ||countFours == 2 && countThrees ==2 ||countFours == 2 && countFives ==2 ||countFours == 2 && countSixes ==2 ||countFives == 2 && countOnes ==2 ||countFives == 2 && countTwos ==2 ||countFives == 2 && countThrees ==2 ||countFives == 2 && countFours ==2 ||countFives == 2 && countSixes ==2 || countSixes == 2 && countOnes ==2 ||countSixes == 2 && countTwos ==2 ||countSixes == 2 && countThrees ==2 ||countSixes == 2 && countFours ==2 ||countSixes == 2 && countFives ==2 )
        {
            return "Two pair";
        }
        else if(countOnes == 4 || countTwos == 4 || countThrees == 4 || countFours == 4 || countFives == 4 || countSixes == 4)
        {
            return "Four of a kind";
        }
        else if( countOnes == 3 || countTwos == 3 || countThrees == 3 || countFours == 3 || countFives == 3 || countSixes == 3)
        {
            return "Three of a kind";
        }
        else 
        {
            return "One pair";
        }
    }
}
