public class InsertionSort
{
    public int[] insertionSort(int[] unorderedArray)
    {
        var length = unorderedArray.length;
        var key = 0;
        var j = 0;
        for (int i = 1; i < length; i++)
        {
            key = unorderedArray[i];
            j = i - 1;
            while ((j >= 0) && (key < unorderedArray[j]))
            {
                unorderedArray[j + 1] = unorderedArray[j];
                j--;
            }
            unorderedArray[j + 1] = key;
        }
        return unorderedArray;
    }
}
