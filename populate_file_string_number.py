import random

afile = open("stringNumbers.txt", "w" )

try:
    #afile.write(str('['))
    for i in range(10000):
        line = str(f'"{random.randint(1, 100)}"') + str(',')
        afile.write(line)
    #afile.write(str(']'))
except ValueError:
    # error handling
    print(f"We have the following ValueError: {ValueError}")
    
afile.close()