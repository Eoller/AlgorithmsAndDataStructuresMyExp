package algorithms.search;

public class SearchAlgorytms {


    public static int binarySearchRecursive(int[] sortedArray, int keyToFind, int lowestIndex, int highestIndex){
        if(highestIndex < lowestIndex){
            return -1;
        }
        int mid = (lowestIndex + highestIndex)/2;

        if(sortedArray[mid] == keyToFind){
            return mid;
        }else if (sortedArray[mid] < keyToFind){
            return binarySearchRecursive(sortedArray, keyToFind, mid + 1, highestIndex);
        }else {
            return binarySearchRecursive(sortedArray, keyToFind, lowestIndex, mid - 1);
        }
    }

    public static int binarySearch(int[] sortedArray, int keyToFind, int lowestIndex, int highestIndex){
        int index = Integer.MAX_VALUE;

        while (lowestIndex <= highestIndex){
            int mid = (lowestIndex + highestIndex) >>> 1;
            if(sortedArray[mid] == keyToFind){
                return mid;
            }
            if(sortedArray[mid] < keyToFind){
                lowestIndex = mid + 1;
            }
            if(sortedArray[mid] > keyToFind){
                highestIndex = mid - 1;
            }
        }

        return index;
    }

}
