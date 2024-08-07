public class QuickSort
{
    // A utility function to swap two elements
    public void swap(int[] array, int i, int j)
    {
        var newValue = array[i];
        array[i] = array[j];
        array[j] = newValue;
    }

    public int partition(int[] array, int low, int high)
    {
        var pivot = array[high];

        var i = (low - 1);

        for (int j = low; j <= (high - 1); j++)
        {
            if (array[j] < pivot)
            {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return (i + 1);
    }

    public void quickSort(int[] unorderedArray, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(unorderedArray, low, high);

            quickSort(unorderedArray, low, pi - 1);
            quickSort(unorderedArray, pi + 1, high);
        }
    }
}
