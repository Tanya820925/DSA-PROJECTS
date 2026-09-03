prev2 = 0
prev1 = 1

print (prev2)
print (prev1)

for i in range(20):
    prev3 = prev1 + prev2
    print (prev3)
    prev2 = prev1
    prev1 = prev3
    