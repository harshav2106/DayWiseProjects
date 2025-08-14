class Vehicle {
  constructor(make, model, year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  getInfo() {
    return `${this.year} ${this.make} ${this.model}`;
  }
}

class Car extends Vehicle {
  constructor(make, model, year, numDoors) {
    super(make, model, year); 
    this.numDoors = numDoors;
  }

  getInfo() {
    return `${super.getInfo()}, Doors: ${this.numDoors}`;
  }
}
const myCar = new Car("Thar", "BaseModel", 2020, 3);
console.log(myCar.getInfo()); 
