
#  Dataset: Employees data
employees = [
    {"id": 1, "name": "Ali", "age": 29, "department": "IT", "salary": 12000},
    {"id": 2, "name": "Mona", "age": 35, "department": "HR", "salary": 9500},
    {"id": 3, "name": "Omar", "age": 41, "department": "Finance", "salary": 15000},
    {"id": 4, "name": "Sara", "age": 27, "department": "IT", "salary": 11000},
    {"id": 5, "name": "Hana", "age": 32, "department": "Marketing", "salary": 9800},
    {"id": 6, "name": "Youssef", "age": 38, "department": "Finance", "salary": 14300},
]

print(" Employee Data Analysis\n")

# 1- Calculate average salary
avg_salary = sum(emp["salary"] for emp in employees) / len(employees)
print(f"Average salary: {avg_salary:.2f}")

# 2- Find employee with the highest salary
highest_salary = max(employees, key=lambda x: x["salary"])
print(f"Highest salary: {highest_salary['name']} ({highest_salary['salary']})")

# 3- Count number of employees in IT department
it_employees = [emp for emp in employees if emp["department"] == "IT"]
print(f"Number of IT employees: {len(it_employees)}")

# 4- Find the oldest employee
oldest = max(employees, key=lambda x: x["age"])
print(f"Oldest employee: {oldest['name']} ({oldest['age']} years old)")

# 5- Find the youngest employee
youngest = min(employees, key=lambda x: x["age"])
print(f"Youngest employee: {youngest['name']} ({youngest['age']} years old)")

# 6- Find employees earning above average salary
above_avg = [emp["name"] for emp in employees if emp["salary"] > avg_salary]
print("Employees earning above average salary:", above_avg)

# 7- Calculate average age for each department
departments = set(emp["department"] for emp in employees)  # unique departments
for dept in departments:
    dept_emps = [emp["age"] for emp in employees if emp["department"] == dept]
    dept_avg_age = sum(dept_emps) / len(dept_emps)
    print(f"Average age in {dept} department: {dept_avg_age:.2f}")

# 8- List all employee names
names = [emp["name"] for emp in employees]
print("Employee names:", names)