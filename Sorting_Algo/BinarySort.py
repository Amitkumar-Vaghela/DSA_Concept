def binary_search(arr, target):
    low = 0
    high = len(arr) - 1

    while low <= high:
        mid = (low + high) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            low = mid + 1
        else:
            high = mid - 1

    return -1  # not found

## Example 
arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
index = binary_search(arr, 5)
print(index)  # Output: 4
