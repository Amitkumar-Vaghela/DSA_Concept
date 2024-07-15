class Solution:
    def sortArray(self, a: List[int]) -> List[int]:
        self.quickSort(a, 0, len(a) - 1)
        return a

    def quickSort(self, a, low, high):
        if low < high:
            pi = self.partition(a, low, high)
            self.quickSort(a, low, pi - 1)
            self.quickSort(a, pi + 1, high)

    def partition(self, a, low, high):
        pivot = a[low]
        i = 0
        j = high

        while i < j:
            while a[i] <= pivot:
                i += 1
            while a[j] > pivot:
                j -= 1
            if i < j:
                a[i], a[j] = a[j], a[i]
        a[low], a[j] = a[j], a[low]

        return j


// Time complaxsity
// best case is 0(n logn)
// worst case is 0(n2)
