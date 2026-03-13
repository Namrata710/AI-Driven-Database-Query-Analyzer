import pandas as pd
from sklearn.ensemble import RandomForestRegressor

data = pd.read_csv("dataset.csv")

X = data[["rows","index"]]
y = data["time"]

model = RandomForestRegressor()
model.fit(X,y)

prediction = model.predict([[1000,1]])

print("Predicted Execution Time:",prediction)