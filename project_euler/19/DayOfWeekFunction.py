def DayOfWeek(Month, Day, Year):
    """Will return the day of the week for a specific date.
        Call with DayOfWeek(month, day, year)

        """

    #Declare Variables
    MonthNumber = ("0","1","4","4","0","2","5","0","3","6","1","4","6")
    Week = ("Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday")
    Total = 0
    DayOfWeek = none 

    #Day of Week Algorithm
    Total = Total + int(Year /4)#A
    Total = Total + Year#B
    Total = Total + Day#C
    Total = Total + MonthNumber[Month]#D
    if(Year % 4 == 0):#E
        if(Month == 1 or Month == 2):
            Total = Total - 1
            pass
    DayOfWeek = Week[(Total % 7)] #F

    Return(DayOFWeek)

    
    
    
    
    
