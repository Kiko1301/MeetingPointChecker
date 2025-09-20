# Meeting Point Checker 🕔

A simple Java console application that determines if three friends (Igor, Mladen, and Dragan) successfully meet based on their arrival times.

## Description

This program takes the arrival times (in hours and minutes) of three individuals and checks if they meet a specific condition to have a successful meeting:
1.  The **first** and **second** person to arrive must be no more than **10 minutes** apart.
2.  The **second** and **third** person to arrive must be no more than **5 minutes** apart.

If both conditions are met, it outputs that they met. Otherwise, it outputs that they did not meet.

## How to Use

1.  **Compile the program:**
    ```bash
    javac Sredba.java
    ```

2.  **Run the program:**
    ```bash
    java Sredba
    ```

3.  **Provide Input:**
    You will be prompted to enter the arrival time for each friend in the console.
    *   First, enter the hour Igor arrived.
    *   Then, enter the minutes Igor arrived.
    *   Repeat this process for Mladen and Dragan.

    **Example Input:**
    ```
    Vreme na doagjanje na Igor (cas): 14
    Vreme na doagjanje na Igor (minuti): 30
    Vreme na doagjanje na Mladen (cas): 14
    Vreme na doagjanje na Mladen(minuti): 35
    Vreme na doagjanje na Dragan(cas): 14
    Vreme na doagjanje na Dragan(minuti): 40
    ```

4.  **View the Result:**
    The program will print who arrived first and whether the group successfully met.

    **Example Output for the input above:**
    ```
    Igor stignal prv
    Se sretnale. :)
    ```

## Code Overview

*   **Language:** Java
*   **Main Class:** `Sredba`
*   **Key Functionality:**
    *   Reads user input using `java.util.Scanner`.
    *   Converts arrival times into total minutes for easy comparison.
    *   Determines the order of arrival (first, second, third).
    *   Calculates the time differences between arrivals.
    *   Applies the meeting rules and prints the result.

## Logic Rules

The meeting is successful **only if**:
*   `(time_second - time_first) <= 10` minutes
*   `(time_third - time_second) <= 5` minutes

## Future Improvements

*   Input validation (e.g., ensuring hours are 0-23 and minutes are 0-59).
*   Handling more than three people.
*   Making the time thresholds (10 and 5 minutes) configurable by the user.
*   A graphical user interface (GUI).

---
**Note:** The prompts in the application are in Macedonian.
