// run with `g++ -o triangle.out triangle.c && ./triangle.out`

#include <iostream>

int triangle(int number) {
	int result = 0;
	for (int i = 1; i <= number; i++)
		result += i;
	return result;
}

int pyramid(int number) {
	int result = 0;
	for (int i = 1; i <= number; i++)
		result += i * i;
	return result;
}

int main() {
	std::cout << "triangle numbers:" << std::endl;
	for (int i = 1; i <= 10; i++)
		std::cout << triangle(i);
	std::cout << std::endl;

	std::cout << "pyramid numbers:" << std::endl;
	for (int i = 1; i <= 10; i++)
		std::cout << pyramid(i);
	std::cout << std::endl;
}
