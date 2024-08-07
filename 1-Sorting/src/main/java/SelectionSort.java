public class SelectionSort
{
    //def selection_sort(arr):
    //    for i in range(len(arr)):
    //      min_idx = i
    //      for j in range(i + 1, len(arr)):
    //          if arr[j] < arr[min_idx]:
    //              min_idx = j
    //              arr[i], arr[min_idx] = arr[min_idx], arr[i]
    //    return arr

    public int[] selectionSort(int[] unorderedArray)
    {
        var length = unorderedArray.length;
        var min = 0;
        var newValue = 0;
        for (int i = 0; i < length; i++)
        {
            min = i;
            for (int j = i + 1; j < length; j++)
            {
                if (unorderedArray[j] < unorderedArray[min])
                {
                    min = j;
                    newValue = unorderedArray[i];
                    unorderedArray[i] = unorderedArray[min];
                    unorderedArray[min] = newValue;
                }
            }
        }
        return unorderedArray;
    }
}
