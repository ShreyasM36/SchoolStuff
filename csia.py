import pandas as pd
import numpy as np
import re
import nltk

data = pd.read_csv("StudentsPerformance.csv")
df.head()







#testing
#code for induvidual corrections etc
import pandas as pd

def compare_questionnaires(file1, file2):
    # Read CSV files into pandas DataFrames
    df1 = pd.read_csv(file1)
    df2 = pd.read_csv(file2)

    # Assuming both CSV files have a common column for identification (e.g., participant_id)
    common_column = 'participant_id'

    # Merge DataFrames on the common column
    merged_df = pd.merge(df1, df2, on=common_column, suffixes=('_file1', '_file2'))

    # Identify differences between the two DataFrames
    differences = merged_df[merged_df.iloc[:, 1:] != merged_df.iloc[:, len(df1.columns) + 1:]]

    # Display areas of improvement
    if differences.empty:
        print("No differences found. The datasets are consistent.")
    else:
        print("Areas of improvement:")
        print(differences)

# Replace 'file1.csv' and 'file2.csv' with the actual file paths of your CSV files
compare_questionnaires('file1.csv', 'file2.csv')

#Now for the GROUP RESULTS ANALYSIS
import pandas as pd

def analyze_questionnaire(user_responses_file, answer_key_file):
    # Read CSV files into pandas DataFrames
    user_responses_df = pd.read_csv(user_responses_file)
    answer_key_df = pd.read_csv(answer_key_file)

    # Assuming both CSV files have a common column for identification (e.g., participant_id)
    common_column = 'participant_id'

    # Merge DataFrames on the common column
    merged_df = pd.merge(user_responses_df, answer_key_df, on=common_column, suffixes=('_user', '_key'))

    # Identify incorrect answers
    incorrect_answers = merged_df[merged_df.iloc[:, len(user_responses_df.columns):] != merged_df.iloc[:, 1 + len(user_responses_df.columns):]]

    # Count the frequency of incorrect answers for each question
    incorrect_counts = incorrect_answers.iloc[:, len(user_responses_df.columns):].apply(pd.Series.value_counts)

    # Display the most common incorrect answers
    most_common_incorrect = incorrect_counts.idxmax().reset_index()
    most_common_incorrect.columns = ['Answer', 'Question']

    print("Most common incorrect answers:")
    print(most_common_incorrect)

# Replace 'user_responses.csv' and 'answer_key.csv' with the actual file paths of your CSV files
analyze_questionnaire('user_responses.csv', 'answer_key.csv')
