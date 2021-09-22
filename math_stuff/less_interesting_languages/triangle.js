"use strict";
// run with `node triangle.js`

// helper functions --------
function range(upperLimit) {
	return [...Array(upperLimit + 1).keys()];
}

function mapToRange(func, upperLimit) {
	return range(upperLimit).map(x => func(x));
}
// -------------------------

// functional(?) style
const triangle = number =>
	range(number)
		.reduce((num, acc) => num + acc);

// imperative style
function pyramid(number) {
	let result = 0;
	for (let i = 1; i <= number; i++)
		result += i * i;
	return result;
}

console.log("triangle numbers")
console.log(mapToRange(triangle, 10))

console.log("pyramid numbers")
console.log(mapToRange(pyramid, 10))


