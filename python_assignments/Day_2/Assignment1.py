tup = (1, 2, 5, (5, 8, 9, (8, 7, 1, (5, 1))))

a = len(tup)

k = 0
arr = []
tup1 = tup
i = -1
p = 0
b = len(tup1)
while i < a - 2:
    i += 1
    print(tup[i])
    p = 0
    k = 0
    tup1 = tup
    b = len(tup1)
    while k < b:
        if tup[i] == tup1[k]:
            print("level ", p, "occurence ", tup[i]) 
        elif isinstance(tup[k], tuple):
            tup1 = tup1[k]
            k = -1
            b = len(tup1)
            p += 1
        else:
            pass
        k += 1
