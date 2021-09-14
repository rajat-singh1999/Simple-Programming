'''
There is a string, , of lowercase English letters that is repeated infinitely many times. Given an integer, , find and print the number of letter a's in the first  letters of the infinite string.



The substring we consider is , the first  characters of the infinite string. There are  occurrences of a in the substring.

Function Description

Complete the repeatedString function in the editor below.

repeatedString has the following parameter(s):

s: a string to repeat
n: the number of characters to consider
Returns

int: the frequency of a in the substring
Input Format

The first line contains a single string, .
The second line contains an integer, .

Constraints

For  of the test cases, .
Sample Input

Sample Input 0

aba
10
Sample Output 0

7
Explanation 0
The first  letters of the infinite string are abaabaabaa. Because there are  a's, we return .

Sample Input 1

a
1000000000000
Sample Output 1

1000000000000
'''

def repeatedString(s, n):
    size = len(s)
    repeated = int(n/size)
    left = int(n - (size * repeated))
    extra = 0

    count = 0
    for i in range(size):
        if s[i] == 'a':
            count+=1

    for i in range(left):
        if s[i] == 'a':
            extra+=1

    repeated = (repeated * count) + extra

    return repeated

def main():
    print(repeatedString('aba', 10))

if __name__=="__main__":
    main()