
## Porject 1 Insertion Sort

# Questions

[22,27,16,2,18,6]

1. Write the stages of the above given Array with using Insertion Method.
2. Write the Big-O Notation of array
3. After the array is sorted, which of the following cases does the number 18 fall into? 
Average case / Worst Case / Best Case

# Answers

1. writing the stages of sorting
We assume that the first element is already sorted then, we select an element at right side. If the element at right side is greater than the element in left side , it is placed on the right otherwise, to the left. In the same way, other element at right side are taken and put in their right place.

    1. [16,22,27,2,18,6]
    2. [2,16,22,27,18,6]
    3. [2,16,18,22,27,6]
    4. [2,6,16,18,22,27]

2. Big O Notation
Best   : O(n)
Worst  : O(n^2^)
Average: O(n^2^)

3. Element "18" is in Average Case.
