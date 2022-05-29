from string import ascii_lowercase

letters = f"{ascii_lowercase}"

with open("states.txt") as f:
    while (line := f.readline().strip().lower()):
        for char in line:
            letters = letters.replace(char, "")

print(letters)

