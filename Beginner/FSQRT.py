# cook your dish here
for _ in range(int(input())):
    n = int(input())
    root = 1;
    
    while((root + 1)**2 <= n):
        root += 1
       
    print(root)
    