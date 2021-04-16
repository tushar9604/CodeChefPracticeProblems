# cook your dish here
t = int(input())

for _ in range(t):
    
    sum = 0
    rem = 0
    num = int(input())
    tens = 10;
    while(num != 0):
        rem = num%tens
        num = num//tens
        sum += rem
        
    
    print(sum);
