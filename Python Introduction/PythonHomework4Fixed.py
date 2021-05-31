# -*- coding: utf-8 -*-
"""
Created on Wed Mar  3 20:40:22 2021

@author: nicho
"""

firstline = ["Happy", "families", "are", "all", "alike;", "every", \
              "unhappy", "family", "is", "unhappy", "in", "its", "own", \
              "way.", "Leo Tolstoy", "Anna Karenina"] 
#%%
def problem4_1(wordlist):
    """ Takes a word list prints it, sorts it, and prints the sorted list """
    print(wordlister)
    print(sorted(wordlister, key = str.lower))
#%%
"""
Problem 4_2:
Write a function that will compute and print the mean and standard deviation 
of a list of real numbers (like the following).  Of course, the length of the
list could be different. Don't forget to import any libraries that you might
need.
Here is my run on the list of 25 floats create below:

problem4_2(numList)
51.528
30.81215290541488

"""
#%%
import random
numList = []
random.seed(150)
for i in range(0,25):
    numList.append(round(100*random.random(),1))
#%%
import statistics
def problem4_2(ran_list):
    """ Compute the mean and standard deviation of a list of floats """
    print(statistics.mean(ran_list))
    print(statistics.stdev(ran_list))

print(problem4_2([1,2,3,4,5]))
