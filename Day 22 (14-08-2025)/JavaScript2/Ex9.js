const numbers = [20, 25, 30];
function sum(a, b, c) {
    return a + b + c;
}
const total = sum(...numbers);
console.log("Sum :", total);