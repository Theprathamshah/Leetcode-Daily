def check_n_and_its_double_solver(arr):
    seen = set()
    for ele in arr:
        if ele % 2 == 0:
            if ele * 2 in seen or ele // 2 in seen:
                return True
        seen.add(ele)
    return False

def main():
    n = int(input("Enter the number of elements: "))
    print(f"Enter {n} elements:")
    arr = list(map(int, input().split()))
    
    if check_n_and_its_double_solver(arr):
        print("Number and its double exist")
    else:
        print("Number and its double doesn't exist")

if __name__ == "__main__":
    main()
