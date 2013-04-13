def encrypt(source, key):
    """"""
    sourceList = list(source)
    
    conversionDictionary = {"a":key[0], "b":key[1], "c":key[2], "d":key[3], "e":key[4], "f":key[5], "g":key[6], "h":key[7], "i":key[8], "j":key[9], "k":key[10], "l":key[11], "m":key[12], "n":key[13], "o":key[14], "p":key[15], "q":key[16], "r":key[17], "s":key[18], "t":key[19], "u":key[20],"v":key[21], "w":key[22], "x":key[23], "y":key[24], "z":key[25]} 

    for i in sourceList:
        for a, b in conversionDictionary.iteritems():
            i = i.replace(a, b)
        
    source = "".join(sourceList)
    return source
