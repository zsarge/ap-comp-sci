package main
// run with `go run triangle.go`

import "fmt"

func triangle(n int) int {
	r := 0
	for i := 1; i <= n; i++ {
		r += i
	}
	return r
}

func pyramid(n int) int {
	r := 0
	for i := 1; i <= n; i++ {
		r += i * i
	}
	return r
}

func main() {
	fmt.Println("triangle numbers")
	for i := 1; i <= 10; i++ {
		fmt.Print(triangle(i), " ")
	}
	fmt.Println()
	fmt.Println("pyramid numbers")
	for i := 1; i <= 10; i++ {
		fmt.Print(pyramid(i), " ")
	}
	fmt.Println()
}
