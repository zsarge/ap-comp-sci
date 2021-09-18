#include <stdio.h>

/* 
 * Build and run with:
 * `make factorial && ./factorial`
 * or
 * `gcc -o factorial factorial.c && ./factorial`
 */

unsigned int factorial(unsigned int number) {
	unsigned int result = 1;
	for (unsigned int i = 1; i <= number; i++)
		result *= i;
	return result;
}

int main() {
	printf("[");
	for (unsigned int i = 1; i < 10; i++)
		printf("%d,", factorial(i));
	printf("%d]\n", factorial(10));
}

