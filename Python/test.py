
def main():
    squared = sorted({x**2 for x in [1,1,2,3,4,4,4,4,4,5,5,12]})
    # squared = squared.sort()
    print(squared)

if __name__ == "__main__":
    main()