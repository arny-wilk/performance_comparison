# Python3 Optimized implementation
# of Bubble sort

import time

# An optimized version of Bubble Sort
def bubble_sort(arr):
    n = len(arr)

    # Traverse through all array elements
    for i in range(n):
        swapped = False

        # Last i elements are already
        #  in place
        for j in range(0, n-i-1):

            # traverse the array from 0 to
            # n-i-1. Swap if the element
            # found is greater than the
            # next element
            if arr[j] > arr[j+1] :
                arr[j], arr[j+1] = arr[j+1], arr[j]
                swapped = True

        # IF no two elements were swapped
        # by inner loop, then break
        if swapped == False:
            break

# Driver code to test above

with open('numbers.txt') as f:
    for line in f:
        line = line.split(',')

start = time.perf_counter()
bubble_sort(line)
print(line)
end = time.perf_counter()

print(f"Elapsed Time in milli seconds: {(end-start)*1000}ms")
