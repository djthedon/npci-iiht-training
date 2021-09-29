# 1
l = []
i = int(input("Enter the number of elements in the user"))

input_lis = lambda x : [int(input()) for j in range(x)]

b = input_lis(i)

print(b)

# 2

input_dic_list = lambda x : {i : i + 1 for i in x}

c = input_dic_list(b)

print(c)

# 3

d = sorted(c.items(), key = lambda x : x, reverse = True)

print(d)
