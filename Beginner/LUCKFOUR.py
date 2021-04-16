import re
t = int(input())

for _ in range(t):
    n = input()
    print(len(re.findall('4',n)))