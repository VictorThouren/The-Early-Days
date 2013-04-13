def keygen():
    """Takes no arguments, returns random key"""
    import random
    #Initialize global function variables
    letters = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
    key = []

    for i in range(26):
        whichOne = random.randint(0, len(letters)-1)
        char = letters[whichOne]
        key.append(char)
        letters.remove(char)

    return key

    

