# Java-Practical

Go to src for practical

<div align="center"><img src="https://gitee.com/duhouan/ImagePro/raw/master/logo.png" width="250px"/></div>

## JAVA Practical 1
Write a Program that displays Welcome to Java, Learning Java Now and Programming is fun.

```python
from clairvoyant.engine import Backtest
import pandas as pd

features  = ["EMA", "SSO"]   # Financial indicators of choice
trainStart = 0               # Start of training period
trainEnd   = 700             # End of training period
testStart  = 701             # Start of testing period
testEnd    = 1000            # End of testing period
buyThreshold  = 0.65         # Confidence threshold for predicting buy (default = 0.65) 
sellThreshold = 0.65         # Confidence threshold for predicting sell (default = 0.65)
continuedTraining = False    # Continue training during testing period? (default = false)

# Initialize backtester
backtest = Backtest(features, trainStart, trainEnd, testStart, testEnd, buyThreshold, sellThreshold, continuedTraining)

# A little bit of pre-processing
data = pd.read_csv("SBUX.csv", date_parser=['date'])
data = data.round(3)                                    

# Start backtesting and optionally modify SVC parameters
# Available paramaters can be found at: http://scikit-learn.org/stable/modules/generated/sklearn.svm.SVC.html
backtest.start(data, kernel='rbf', C=1, gamma=10)
backtest.conditions()
backtest.statistics()  
backtest.visualize('SBUX')
```
