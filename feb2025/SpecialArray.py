'''.DS_Store

'''

def specialArrayFunction(nums):
    for i in range(1, len(nums)):
        if not ((nums[i] ^ nums[i-1])&1):
            return False
    return True

print(specialArrayFunction([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])) # True
print(specialArrayFunction([3, 0, 7, 0, 11])) # True
print(specialArrayFunction([0, 0])) # False
print(specialArrayFunction([0, 4, 3, 0, 4])) # False