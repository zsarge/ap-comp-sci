# run with `python triangle.py`

def triangle(num: int) -> int:
    return sum(range(num+1))

def pyramid(num: int) -> int:
    return sum(map(lambda x: x*x, range(num+1)))

def main():
    print("triangle numbers")
    print([triangle(i) for i in range(10+1)])
    print("pyramid numbers")
    print([pyramid(i) for i in range(10+1)])

if __name__ == "__main__":
    main()

