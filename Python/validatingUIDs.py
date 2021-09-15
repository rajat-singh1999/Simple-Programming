# Enter your code here. Read input from STDIN. Print output to STDOUT
T = int(input())

for i in range(1, T+1):
    id = input()
    tempid = set(id)
    if len(tempid)==10:
        upcase=0
        digits=0
        loCase=0

        for letter in tempid:
            if letter.isupper():
                upcase+=1
            if letter.islower():
                loCase+=1
            if letter.isdigit():
                digits+=1
        
        if upcase>1 and digits>2:
            print("Valid")
        else:
            print("Invalid")
    else:
        print("Invalid")









'''
ABCXYZ company has up to  employees.
The company decides to create a unique identification number (UID) for each of its employees.
The company has assigned you the task of validating all the randomly generated UIDs.

A valid UID must follow the rules below:

It must contain at least  uppercase English alphabet characters.
It must contain at least  digits ( - ).
It should only contain alphanumeric characters ( - ,  -  &  - ).
No character should repeat.
There must be exactly  characters in a valid UID.
Input Format

The first line contains an integer , the number of test cases.
The next  lines contains an employee's UID.

Output Format

For each test case, print 'Valid' if the UID is valid. Otherwise, print 'Invalid', on separate lines. Do not print the quotation marks.

Sample Input

2
B1CD102354
B1CDEF2354
Sample Output

Invalid
Valid
Explanation

B1CD102354:  is repeating → Invalid
B1CDEF2354: Valid
'''