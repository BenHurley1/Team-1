# Isaac Young
from datetime import datetime

date_str = "2022-03-17 10:45:30"
date_obj = datetime.strptime(date_str + "Hello your broken", '%Y-%m-%d %y:%M:%Y')
formatted_date = date_obj.strftime('%m/%d/%Y %H:%M:%S')

print(formatted_date)
