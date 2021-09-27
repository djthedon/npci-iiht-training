x1 = [75, 86, 78]
x2 = [74, 12, 78]
x3 = [74, 12, 40]

w1 = 'p'
s1 = 0
p = 0
for i in x1:
    if i < 50:
        w1 = 'r'
        p += 1
    if p == 2:
        w1 = 'f'
    s1 += i

w2 = 'p'x1 = [75, 86, 78]
x2 = [74, 12, 78]
x3 = [74, 12, 40]

w1 = 'p'
s1 = 0
p = 0
for i in x1:
    if i < 50:
        w1 = 'r'
        p += 1
    if p == 2:
        w1 = 'f'
    s1 += i

w2 = 'p'
s2 = 0
p = 0
for i in x2:
    if i < 50:
        w2 = 'r'
        p += 1
    if p == 2:
        w2 = 'f'
    s2 += i

s3 = 0
w3 = 'p'
p = 0
for i in x3:
    if i < 50:
        w3 = 'r'
        p += 1
        
    if p == 2:
        w3 = 'f'
    s3 += i


avg1 = (s1 / 300) * 100
avg2 = (s2 / 300) * 100
avg3 = (s3 / 300) * 100

r1 = ''
if w1 == 'p':
    if avg1 >= 50 and avg1 <= 59:
       r1 = 'Second Divison'
    elif avg1 >= 60 and avg1 <= 79:
        r1 = 'First Divison'
    else:
        r1 = 'Distinction'
elif w1 == 'r':
    r1 = 're-appearing'
else:
    r1 = 'fail'

r2 = ''
if w2 == 'p':
    if avg2 >= 50 and avg2 <= 59:
       r2 = 'Second Divison'
    elif avg2 >= 60 and avg2 <= 79:
        r2 = 'First Divison'
    else:
        r2 = 'Distinction'
elif w2 == 'r':
    r2 = 're-appearing'
else:
    r2 = 'fail'

r3 = ''
if w3 == 'p':
    if avg3 >= 50 and avg3 <= 59:
       r3 = 'Second Divison'
    elif avg3 >= 60 and avg3 <= 79:
        r3 = 'First Divison'
    else:
        r3 = 'Distinction'
elif w3 == 'r':
    r3 = 're-appearing'
else:
    r3 = 'fail'

print(r1, r2, r3)
s2 = 0
p = 0
for i in x2:
    if i < 50:
        w2 = 'r'
        p += 1
    if p == 2:
        w2 = 'f'
    s2 += i

s3 = 0
w3 = 'p'
p = 0
for i in x3:
    if i < 50:
        w3 = 'r'
        p += 1
        
    if p == 2:
        w3 = 'f'
    s3 += i


avg1 = (s1 / 300) * 100
avg2 = (s2 / 300) * 100
avg3 = (s3 / 300) * 100

r1 = ''
if w1 == 'p':
    if avg1 >= 50 and avg1 <= 59:
       r1 = 'Second Divison'
    elif avg1 >= 60 and avg1 <= 79:
        r1 = 'First Divison'
    else:
        r1 = 'Distinction'
elif w1 == 'r':
    r1 = 're-appearing'
else:
    r1 = 'fail'

r2 = ''
if w2 == 'p':
    if avg2 >= 50 and avg2 <= 59:
       r2 = 'Second Divison'
    elif avg2 >= 60 and avg2 <= 79:
        r2 = 'First Divison'
    else:
        r2 = 'Distinction'
elif w2 == 'r':
    r2 = 're-appearing'
else:
    r2 = 'fail'

r3 = ''
if w3 == 'p':
    if avg3 >= 50 and avg3 <= 59:
       r3 = 'Second Divison'
    elif avg3 >= 60 and avg3 <= 79:
        r3 = 'First Divison'
    else:
        r3 = 'Distinction'
elif w3 == 'r':
    r3 = 're-appearing'
else:
    r3 = 'fail'

print(r1, r2, r3)
