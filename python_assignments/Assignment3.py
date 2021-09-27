a = int(input("Enter the range"))
b = int(input("Enter the value"))

p = 1

arr = list()

s1 = 0

p1 = []

for i in range(1, a + 1):
    k = 0
    l = p
    s = 0
    n1 = []
    while k < a  - i:
        print(end = " ")
        k += 1
    for j in range(a):
        if j < i:
            print(l, end = " ")
            s += l
            n1.append(l)
            l += 1
        else:
            n1.append(0)
    p1.append(n1)

    arr.append(s)
    p += b
    print()
    s1 += s

arr.append(s1)

print('\n', arr)

print(p1)

print(p1[ :: -1])

q1 = []

for i in p1:
    q2 = []
    for j in i:
       q2.append(j * j)
    q1.append(q2)

print(q1[ ::-1])