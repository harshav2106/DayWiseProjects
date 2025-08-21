let persons = [
    { name: "Harsha", age: 23, city: "NDK" },
    {name: "Sowmya", age: 17, city: "Kadapa" },
    {name: "Amma", age: 45, city: "Kurnool" }];
persons = persons.map(person => {
    return {
        name: person.name,
        age: person.age,
        city: person.city,
        status: person.age >= 18 ? "adult" : "minor"
    };
});
console.log(persons);
