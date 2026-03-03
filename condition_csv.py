
rows = [
    {"day": "2025-01-01", "revenue": 120, "cost": 80},
    {"day": "2025-01-01", "revenue": 40,  "cost": 50},
    {"day": "2025-01-02", "revenue": 200, "cost": 100},
    {"day": "2025-01-02", "revenue": 100, "cost": 90},
    {"day": "2025-01-03", "revenue": 20,  "cost": 50},
    {"day": "2025-01-04", "revenue": 500, "cost": 200},
    {"day": "2025-01-04", "revenue": 600, "cost": 220},
]


daily = {}

for row in rows:
    day = row["day"]
    if day not in daily:
        daily[day] = {"revenue": 0, "cost": 0}

    daily[day]["revenue"] += row["revenue"]
    daily[day]["cost"] += row["cost"]



def classify_day(total_rev, total_cost):
    profit = total_rev - total_cost

    
    if total_rev == 0:
        margin_ratio = -1
    else:
        margin_ratio = profit / total_rev

    if profit < 0:
        return "Loss"
    elif margin_ratio < 0.10:
        return "Low Margin"
    elif margin_ratio < 0.30:
        return "Healthy"
    else:
        return "Peak"



print("Daily Classification Report")
print("-----------------------------------")

for day in sorted(daily.keys()):
    totals = daily[day]
    label = classify_day(totals["revenue"], totals["cost"])
    print(f"{day}: {label}  (Revenue={totals['revenue']}, Cost={totals['cost']})")
