let persons = [
    { name: "Harsha", age: 23, city: "NDK" },
    {name: "Sowmya", age: 17, city: "Kadapa" },
    {name: "Amma", age: 45, city: "Kurnool" }];
for (let i = 0; i < persons.length; i++) {
    if (persons[i].age >= 18) {
        persons[i].status = "adult";
    } else {
        persons[i].status = "minor";
    }
}
console.log(persons); 



