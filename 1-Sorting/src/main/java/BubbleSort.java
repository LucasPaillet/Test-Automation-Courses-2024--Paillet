public class BubbleSort
{
    public int[] bubbleSort(int[] unorderedArray)
    {
        var length = unorderedArray.length;
        var newValue = 0;
        for (int i = 0; i < length; i++)
        {
            for (int j = 0; j < (length - i - 1); j++)
            {
                if(unorderedArray[j] > unorderedArray[j + 1])
                {
                    newValue = unorderedArray[j];
                    unorderedArray[j] = unorderedArray[j + 1];
                    unorderedArray[j + 1] = newValue;
                }
            }
        }
        return unorderedArray;
    }
}
