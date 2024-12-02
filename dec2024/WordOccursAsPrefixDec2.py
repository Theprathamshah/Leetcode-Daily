words = input()
prefix = input()

def solution(arr, prefix):
    for i in arr:
        if i.startswith(prefix):
            print(f"word {i} strts with prefix {prefix}")
            return
    return -1


arr = words.split()
res = solution(arr,prefix)
if res == -1:
    print(f"Word with prefix {prefix} don't exist")




