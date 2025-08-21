let names = ["Harsha","Srikanth","Badarinath","Ashok"];

let makeUppercase = names
  .filter(name => name.length > 5)     
  .map(name => name.toUpperCase());

console.log(makeUppercase);
