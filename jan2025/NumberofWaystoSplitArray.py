'''
Problem Statment

You are given a 0-indexed integer array nums of length n.

nums contains a valid split at index i if the following are true:

The sum of the first i + 1 elements is greater than or equal to the sum of the last n - i - 1 elements.
There is at least one element to the right of i. That is, 0 <= i < n - 1.
Return the number of valid splits in nums.

'''

def solution(arr):
    summ = sum(arr)
    currSum = 0
    counter = 0
    length = len(arr)

    for i in range(length-1):
        summ -= arr[i]
        currSum += arr[i]
        if currSum>=summ:
            counter+=1
    
    return counter

n = int(input())

arr = []

for i in range(n):
    arr.append(int(input()))

print(solution(arr))

