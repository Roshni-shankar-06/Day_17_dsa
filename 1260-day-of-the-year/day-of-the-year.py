class Solution:
    def dayOfYear(self, date: str) -> int:
        year = int(date[:4])
        month = int(date[5:7])
        day = int(date[8:])
        
        # Check for leap year
        is_leap = (year % 400 == 0) or (year % 4 == 0 and year % 100 != 0)
        feb_days = 29 if is_leap else 28
        
        days_in_months = [31, feb_days, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        
        # Sum days of previous months plus current day
        return sum(days_in_months[:month - 1]) + day
        
    
   
