import pandas as pd

def find_employees(employee: pd.DataFrame) -> pd.DataFrame:
    salary_map = employee.set_index("id")["salary"]
    employee["manager_salary"]=employee["managerId"].map(salary_map)
    result=employee[employee["salary"]>employee["manager_salary"]]
    return result[["name"]].rename(columns={"name":"Employee"})