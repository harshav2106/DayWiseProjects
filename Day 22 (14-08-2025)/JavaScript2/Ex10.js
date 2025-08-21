function sumNumbers(...numbers) {
  return numbers.reduce((sum, num) => sum + num, 0);
}
console.log(sumNumbers(1, 2, 3, 4));
console.log(sumNumbers(20));        
console.log(sumNumbers());          
