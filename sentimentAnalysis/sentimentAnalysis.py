import csv
import sys
from textblob import TextBlob
from nltk.corpus import stopwords

infile = sys.argv[1]
positive=0
negative=0
total=0
with open(infile, 'r') as csvfile:
    rows = csv.reader(csvfile)
    for row in rows:
        sentence = row[0]
        blob = TextBlob(sentence)
        if blob.sentiment.polarity>=0:
            positive=positive+1
            total=total+1
        else:
            negative=negative+1
            total=total+1
    positive = positive + 0.0
    negative = negative + 0.0
    positivePercent = (positive/total)*100
    negativePercent = (negative/total)*100
    print "Percent of positive comments:", positivePercent,"%"
    print "Percent of negative comments:", negativePercent,"%"
