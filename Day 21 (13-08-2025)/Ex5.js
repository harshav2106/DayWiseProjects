var x = 4;
 
const z = 9; 
let y=10;
 
function f() {
  x = 9;
  let y = 8; 
   console.log("x in function is " + x);
   console.log("y in function is " + y);
 
  if (true) {
    let z = 18;
    console.log("y in if block is " + y);
  }
  console.log("z in function is " + z); 
}
f();
 console.log("y outside  function is " + y);