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
