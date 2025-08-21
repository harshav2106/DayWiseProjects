let employees = [
  { name: "Amrutha", role: "Manager", empId: 1, salary: 80000 },
  { name: "Jayantha", role: "Developer", empId: 2, salary: 65000 },
  { name: "Nawaz", role: "QA", empId: 3, salary: 50000 },
  { name: "Fransis", role: "Manager", empId: 4, salary: 90000 }
];

let totalManagerSalary = employees
  .filter((emp) => emp.role === "Manager")
  .reduce((total, manager) => total + manager.salary, 0);

console.log("Total salary of all managers:", totalManagerSalary);
