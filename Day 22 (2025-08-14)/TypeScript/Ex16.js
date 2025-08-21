function printEmployees(employees) {
    console.log("Employee Details:");
    employees.forEach(function (emp) {
        console.log("ID: ".concat(emp.empId, ", Name: ").concat(emp.empName, ", Salary: ").concat(emp.salary));
    });
    return employees.length;
}
var employeeList = [
    { empId: 1, empName: "Harsha", salary: 30000 },
    { empId: 2, empName: "Srikanth", salary: 35000 },
    { empId: 3, empName: "Ashok", salary: 30000 }
];
var count = printEmployees(employeeList);
console.log("Total Employees: ".concat(count));
