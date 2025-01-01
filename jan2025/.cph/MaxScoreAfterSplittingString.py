def solution(string:str) -> int:
    ones = string.count('1')
    zeros = 0
    i = 0
    max_score = 0
    while i<len(string)-1:
        if string[i] == '0':
            zeros += 1
        else:    
            ones -= 1
        i += 1
        max_score = max(max_score, zeros+ones)
    return max_score

string = input()
print(solution(string))
        