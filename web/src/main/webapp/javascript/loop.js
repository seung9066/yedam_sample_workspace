let numbers = [23, 33, 14, 52, 77, 55, 16];

let result = 0;
for (let numberr of numbers) {
    if (numberr % 2 == 0) {
        result += numberr;
    }
}
console.log('짝수 합 : ' + result)

result = 0;
for (let i=0; i<numbers.length; i++) {
    if (i % 2 == 0) {
        result += numbers[i];
    }
}
console.log('짝수번째 합 : ' + result)

result = 0;
numbers.forEach((a,b) => {
    if (b % 2 != 0) {
        result += a;
    }
});
console.log('홀수번째 합 : ' + result)

result = 0;
numbers.forEach((a, b, c) => {
    if (a % 2 != 0) {
        result += a
    }
});
console.log('홀수 합 : ' + result)

result = 0;
numbers.forEach((a, b, c) => {
    if (a > 30) {
        result += a
    }
});
console.log('30보다 큰 값 : ' + result)