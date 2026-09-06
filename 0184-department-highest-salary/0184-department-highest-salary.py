import pandas as pd

def department_highest_salary(employee: pd.DataFrame, department: pd.DataFrame) -> pd.DataFrame:
    # Merging the employee and department DataFrames based on departmentId
    merged = employee.merge(department, left_on='departmentId', right_on='id', how='left')

    # Filtering employees whose salary equals the highest salary in their department
    highest_salary = merged.loc[merged.groupby('departmentId')['salary'].transform('max') == merged['salary']]
    
    # Renaming the columns to match the output format
    result = highest_salary[['name_x', 'salary', 'name_y']].rename(columns={ 
        'name_y': 'Department',  # department name column
        'name_x': 'Employee',    # employee name column
        'salary': 'Salary'       # salary column
    })
        
    # Returning the final result in the desired order
    return result[['Department', 'Employee', 'Salary']]