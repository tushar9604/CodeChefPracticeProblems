player1=0
player2=0
lead=0
leader=0

t = int(input())
for _ in range(t):
    x,y = map(int,input().split())
    player1 += x
    player2 += y
    
    if(abs(player1 - player2) > lead):
        lead = abs(player1 - player2)
        
        if(player1 > player2):
            leader=1
        else:
            leader=2
            
print(leader,lead)
    
    
    
        