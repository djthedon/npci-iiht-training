a = [
        ['Mohsin', 'mn@gg.com', '1283', 'city', 'street'],
        ['Test', 'tt@user.com', '9999'],
        ['Username', 'email', '12478'],
        ['Hello', 'email@34','9456'],
        [],
        ['pqr', 'rty', 'zxc']
    ]

with open('sample.txt', 'w') as r:
    r.write("name,email,phone \n")
    for i in a:
        if len(i) <= 2:
            continue
        p = 0
        while p < 2:
            r.write(i[p])
            r.write(',')
            p += 1
        r.write(i[p])
        r.write('\n')

result = list()
result1 = list()
c = ''

with open('sample.txt', 'r') as r:
    r.readline()
    for i in r.readlines():
        tmp = i.split(',')
        result.append((tmp[0], tmp[1], tmp[2][0:len(tmp[2]) - 1]))

print(tuple(result))    
