interface Employee {
    empId: number;
    empName: string;
    salary: number;
}
function printEmployees(employees: Employee[]): number {
    console.log("Employee Details:");
    employees.forEach(emp => {
        console.log(`ID: ${emp.empId}, Name: ${emp.empName}, Salary: ${emp.salary}`);
    });

    return employees.length;
}

const employeeList: Employee[] = [
    { empId: 1, empName: "Harsha", salary: 30000 },
    { empId: 2, empName: "Srikanth", salary: 35000 },
    { empId: 3, empName: "Ashok", salary: 30000 }
];

const count = printEmployees(employeeList);
console.log(`Total Employees: ${count}`);
