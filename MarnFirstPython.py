# -*- coding: utf-8 -*-
"""
Created on Thu Feb 11 12:05:35 2021

@author: nicho
"""

""" Starting python learning. """

#%%
def hello():
    print("Hello, world!")
#%%

""" To start a new cell, you can use #%%, this creates a cell, which can be
executed individually instead of the entire code. Furthermore, you can use
run current cell command (next to the play symbol) to just run that cell. 
You can also use Control-Enter
"""
#%%
def runner():
    while True:
        pass
""" This creates an infinite run condition, to kill it, use Ctrl C as 
the signal. """

#%%

""" Starting to learn the syntax of python. You can do basic arithmetic in the
console.
+ is add, - is subtract, / is divide (with remainder), * is multiply. 
// will give you the quotient i.e 13/4 = 3.
by contrast, % will give you the remainder.

remember to use four spaces instead of tabs-- this can somtimes cause confusion for Python.
 """
def areacircle(radius):
    area = 3.14*radius**2
    print("The area of a circle of radius", radius, "is", area)


#%%
""" this function solves for the area of a triangle given two input parameters,
a and b, where a represents the base of the triangle and b represents the
height. In order to put this in the documentation of the function
we have to place a triple quotes under the function itself as documented 
here"""
def areatriangle(a, b):
    """This function solves for the area of a triangle given two input parameters,
a and b, where a represents the base of the triangle and b represents the
height."""
    area =.5*a*b
    print("The area of a triangle with base", a, "and height", b, "is", area)
#%%
areatriangle(3, 5)
areatriangle(2, 10)
areacircle(4)  
""" THIS WORKS!!! """
""" Moving on to strings, to make a string we use ' or ". Either works eqally
well. However, whichever one you use first, you need to use second. I.E
the sentence 'this is a sentence" WILL NOT WORK. 

if you need BOTH a ' and " in your string, you can use the escape character \.
This tells Python that the following character is to be taken as a LITERAL 
character and is not a quote mark that is delimiting the string. The following
is an example """
#%%
both = "My cat's name is \"Cleo\""
"""can I overwrite this without a def? Let's find out. The answer ios no,
it draws the help statement for the object from the inherited string function.
"""
print(both)
#%%
def celcius_to_fahrenheit(tempInput):
    """This function converts a given temperature input in Celcius to it's
    Fahrenheit equivalent by multipling it by 9/5 and adding 32. """
    fahrenheit_output = (tempInput*1.8) + 32
    print(tempInput,"converted to Fahrenheit is", fahrenheit_output, 
          "degrees." )
""" Next, we are going to cover python comnmands where user input is taken,
this works as follows. """

#%%
def name_getter():
    """Takes two inputs from the user, first name and last name, and assigns
    them to their relevant variables. Then, python combines them to form the
    output of the full name demonstrating string concantentation"""
    
    first_name = input ("Enter your first name: ")
    last_name = input("Enter your last name: ")
    final_name = first_name + " " + last_name + " "
    
    print("Thanks! Your name is:", final_name)
    
#%%
""" The following serves as a code based introduction of three programming
concepts, if, if/else, if/else-if/else """

def if_statements():
    """ This function takes no inputs, uses three local variables (x, y, z),
    and subsequently uses them to generate examples of how the if/else 
    statmeents funcction in the python programming language. """
    x = 1
    y = 0
    z = 0
    """ Note, this carries the same features as Java, wherein = acts as the
    assignment operator, and == acts as the testing equivalence operator. """
    
    """ Simple IF statement """
    if x > 0:
        print("Test one: var x is positive!")
    """ Simple IF/ELSE statements """
    if y > 0:
        print("Test two: var y is positive!")
    else:
        print("Test two: var y is not positive!")
    """ Simple IF/ELSE-IF/ELSE Statement series """
    if z > 0:
        print("Test three: var z is positive!")
    elif z < 0:
        print("Test three: var z is negative!")
    else:
        print("Test three: var z is equal to zero!")
#%%
def python_equality_checker(input_one, input_two):
    """ Takes two inputs, input_one and input_two, and checks whether they
    are equal """
    if input_one == input_two:
        print("These inputs are equal")
    else:
        print ("These inputs are not equal!")
    """ Note-- the does not equal operator, !=, functions along similar 
    lines. """
    
#%%
""" To cast in the phython language, it works similar in fashion to java """
""" Example of a while loop """
def blastoff():
    """ Example of a while loop! """
    i = 10
    while i > 0:
        print(i)
        i = i - 1
    print("Blastoff!")
    

        
        
    