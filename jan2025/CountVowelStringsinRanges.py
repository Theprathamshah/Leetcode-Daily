def isVowel(char):
    return char in ['a', 'e', 'i', 'o', 'u']
def CountVowelStringsinRangesSolution(words, queries):
    counter = 0
    prefixArray = []
    result = []
    for s in words:
        if isVowel(s[0]) and isVowel(s[-1]):
            prefixArray.append(1)
        else:
            prefixArray.append(0)
    for i in range(1,len(prefixArray)):
        prefixArray[i] += prefixArray[i-1]
    for q in queries:
        start,end = q
        if start == 0:
            result.append(prefixArray[end])
        else:
            result.append(prefixArray[end]-prefixArray[start-1])
    
    return result

n = int(input())
m = int(input())
words = []

for i in range(n):
    words.append(input())

queries = []

for i in range(m):
    queries.append(list(map(int, input().split())))
    
print(CountVowelStringsinRangesSolution(words, queries))


# Time: O(n)

'''.DS_Store
5
3
aba
bcb
ece
aa
e
0 2
1 4
1 1

'''
