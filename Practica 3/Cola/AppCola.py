'''
Se inserta elementos en la cola A.
Luego, se lleva los elementos de la cola A,
a las colas B y C.
Si el elemento es primo se inserta en la cola B,
si el elemento no es primo se inserta en la cola C.
Se utiliza la Criba de Eratóstenes para determinar
si un número es primo.
'''
import math
from Cola import Cola
num = 500
primo = [True] * num

def criba():
    for i in range(2,int(math.sqrt(num))+1):
        if primo[i] == True:
            for j in range(i * i, num, i):
                primo[j] = False

criba()
A = Cola(5)
A.insert(7)
A.insert(22)
A.insert(11)
A.insert(10)

B = Cola(5)
C = Cola(5)
while not A.isEmpty():
    e = A.remove()
    if primo[e]:
        B.insert(e)
    else:
        C.insert(e)
        
print("Cola B:")
while not B.isEmpty():
    print(B.remove())
    
print("Cola C:")
while not C.isEmpty():
    print(C.remove())
