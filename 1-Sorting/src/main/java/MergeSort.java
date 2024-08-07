import java.util.Arrays;

public class MergeSort
{
    public int[] mergeSort(int[] unorderedArray)
    {
        var length = unorderedArray.length;
        var middle = 0;
        int[] leftArray = {};
        int[] rightArray = {};
        if (length > 1)
        {
            middle = length / 2;
            leftArray = Arrays.copyOfRange(unorderedArray, 0, middle);
            rightArray = Arrays.copyOfRange(unorderedArray, middle, length);
            mergeSort(leftArray);
            mergeSort(rightArray);

            int i = 0, j = 0, k = 0;
            while ((i < leftArray.length) && (j < rightArray.length))
            {
                if (leftArray[i] < rightArray[j])
                {
                    unorderedArray[k] = leftArray[i];
                    i++;
                }
                else
                {
                    unorderedArray[k] = rightArray[j];
                    j++;
                }
                k++;

                while (i < leftArray.length)
                {
                    unorderedArray[k] = leftArray[i];
                    i++;
                    k++;
                }
                while (j < rightArray.length)
                {
                    unorderedArray[k] = rightArray[j];
                    j++;
                    k++;
                }
            }
        }
        return unorderedArray;
    }
}
