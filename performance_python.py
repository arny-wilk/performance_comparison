import time
import random

def bubble_sort(mylist):
    n = 10000
    swapped = True

    while swapped:
        swapped = False

        for i in range(1, n):
            if mylist[i-1] > mylist[i]:
                mylist[i], mylist[i-1]  = mylist[i-1], mylist[i]
                swapped = True

    return mylist


mylist = []

for _ in range(10000):
    mylist.append(random.randint(0, 100))


start = time.time()
bubble_sort(mylist)
end = time.time()

print(f"Elapse time : {(end-start)*1000}ms")
