import random

afile = open("numbers.txt", "w" )

try:
    #afile.write(str('['))
    for i in range(10000):
        line = str(random.randint(1, 10000)) + str(',')
        afile.write(line)
    #afile.write(str(']'))
except ValueError:
    # error handling
    print(f"We have the following ValueError: {ValueError}")
    
afile.close()


