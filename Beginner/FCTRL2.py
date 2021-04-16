# cook your dish here
t = int(input())

for _ in range(t):
    num = int(input());
    fact = 1
    
    while(num > 0):
        fact = fact*num;
        num -= 1
        
    print(fact)
    