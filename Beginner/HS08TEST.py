x,y = map(float,input().split())

if((x%5==0) & (y-x>=0.5)):
    y = y - x - 0.5;
   
print(y)