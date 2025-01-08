# Sort-Arrays
This is a program made entirely in java that is meant to sort arrays that are determined by the user using different algorithims which are also determined by the user.
All of the code used in the files are based upon the tutorials made by [geeksforgeeks.org](https://www.geeksforgeeks.org/time-complexities-of-all-sorting-algorithms/)

## [Selection Sort](https://www.geeksforgeeks.org/selection-sort-algorithm-2/)
Selection Sort is an algorithim that sorts arrays through repeatidly swapping the smallest element in the array with the first unsorted element in the array

## [Bubble Sort](https://www.geeksforgeeks.org/bubble-sort-algorithm/)
Bubble Sort is an algorithim that sorts arrays through repeatidly swapping two adjacent elements if they are in the wrong order

## [Heap Sort](https://www.geeksforgeeks.org/heap-sort/)
Heap sort is a comparison-based sorting technique based on [Binary Heap Data Structures](https://www.geeksforgeeks.org/binary-heap/)
> A Binary Heap is a complete Binary tree which is used to store data efficiently to get the max or min element based on its type

Heap sort can be seen as an optimization of selection sort where we first find the max element and swap it with the last element and repeating until the array is sorted.
In heap sort we use Binary Heap so we can quickly find and move the max element in a more optimized method than in selection sort

## [Insertion Sort](https://www.geeksforgeeks.org/insertion-sort-algorithm/)
Insertion sort is a simple sorting algorithim that works by iteratively inserting each element of an unsorted ist into its correct position in a certain portion of the list.
- You start with the second element of the array and compare it with the first element checking if the second element is smaller than the first, if the second element *is* smaller you swap them.
- Then you will move to the third element and compare it with the first element with the swap check, and then if it doesnt swap you will compare it with the second element.
- And you repete this until the list is sorted

## [Quick Sort](https://www.geeksforgeeks.org/quick-sort-algorithm/)
Quick Sort is a algorithim based on the [Divide and Conquer method](https://www.geeksforgeeks.org/introduction-to-divide-and-conquer-algorithm/) that picks an element in the array as a pivor and partitions the given array around the elected pivot by placing the pivot in its correct position in the sorted array
> Divide and Conquer Algorithm involves breaking a larger problem into smaller subproblems, solving them independently, and then combining their solutions to solve the original problem. The basic idea is to recursively divide the problem into smaller subproblems until they become simple enough to be solved directly. Once the solutions to the subproblems are obtained, they are then combined to produce the overall solution. 
- Firstly you have to select an element of the array to act as the pivot
- Then you have to rearrange the array around the pivot, after partitioning all elements smaller than the pivot will ve on its left while all elements larger than the pivot will be on its right
- then you recursively call this until the array no longer changes

## [Merge Sort](https://www.baeldung.com/java-merge-sort)
Merge sort is an algorithim that follows the [Divide and Conquer approach](https://www.geeksforgeeks.org/introduction-to-divide-and-conquer-algorithm/), it works by recursively dividing the input array into smaller subarrays and sorting those subarrays, then merging them back together to obtain the sorted array. Or in other words, merge sort divides the array into two seperate halves, sorts each half individually before merging those halves together, repeating until the array is sorted.
