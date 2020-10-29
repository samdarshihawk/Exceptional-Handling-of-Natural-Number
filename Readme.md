I have Implement a class Natural Number that represents Postive Integer (x>=0). The class only attribute is Int x.
Implemented a constructor that throws exception ErrConstrException if the value of the argument less than 0(x<0).
Created a method called void minus(NautralNumber x) that subtracts x from the calling object. It throws exception
ErrModifException if the result is less than zer0((y-x) < 0).
ErrConstrException and ErrModifException are class that inherit from exception class.
There's a driver class that creates an array of NaturalNumber; it can sotre 10 objects of same type. Moreover, the Implementation of the code is tested in this class.


