let persons = [
  { name: "Harsha", age: 23, city: "NDK" },
  { name: "Sowmya", age: 17, city: "Kadapa" },
  { name: "Amma", age: 45, city: "Kurnool" }
];

let eligibleVoters = persons.filter((person) => person.age >= 18);

console.log("Eligible voters:");
console.log(eligibleVoters);
