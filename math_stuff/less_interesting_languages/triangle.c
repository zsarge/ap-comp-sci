// run with `gcc -o triangle.out triangle.c && ./triangle.out`

#include <stdio.h>

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
	printf("triangle numbers:\n");
	for (int i = 1; i <= 10; i++)
		printf("%d ", triangle(i));

	printf("\npyramid numbers:\n");
	for (int i = 1; i <= 10; i++)
		printf("%d ", pyramid(i));

	printf("\n");
}
