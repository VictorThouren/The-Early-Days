#Project Euler, problem 1

number = 0
total = 0
mod3 = 1
mod5 = 1

while (number < 1000):
    mod3 = number % 3
    mod5 = number % 5

    if mod3 == 0 or mod5 == 0 :
        total = total + number
   
    number = number + 1
    mod3 = 0
    mod5 = 0
print total 
