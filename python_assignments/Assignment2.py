a = int(input("Enter the range"))
b = int(input("Enter the distance"))

p = 1

arr = list()

for i in range(1, a + 1):
    k = 0
    while k < a  - i:
        print(end = " ")
        k += 1
    for j in range(i):
        print(p, end = " ")
    arr.append(i * p)
    p += b
    print()

print('\n', arr)
