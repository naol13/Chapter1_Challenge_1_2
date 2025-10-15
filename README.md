# Chapter1_Challenge_1_2: The Lottery Number Analyzer

## Description
This Java project implements a simple lottery number analyzer. It processes a predefined array of winning lottery ticket numbers (in the format "XX-XX-XX-XX-XX"), removes the dashes, converts each digit to an integer, calculates the sum and average of the digits for each ticket, and identifies the ticket with the highest digit average.

The program demonstrates the use of both traditional for loops (indexed) and for-each loops in Java, as required by the challenge.

## Features
- **Dash Removal**: Strips dashes from ticket strings to isolate digits.
- **Digit Summation**: Calculates the total sum of all digits in a ticket.
- **Average Calculation**: Computes the average digit value (assuming 10 digits per ticket).
- **Winner Identification**: Tracks and announces the ticket with the highest average.
- **Loop Demonstration**: Uses an indexed for loop for ticket iteration and a for-each loop for digit processing.

## Requirements
- Java Development Kit (JDK) 8 or higher
- NetBeans IDE (recommended for easy project management)

## How to Run
1. **Open in NetBeans**:
   - Launch NetBeans IDE.
   - Select `File > Open Project`.
   - Navigate to the project directory (Documents/NetBeansProjects/Chapter1_Challenge_1_2`) and open it.

2. **Build the Project**:
   - Right-click the project in the Projects window.
   - Select `Build` or run `ant build` in the terminal.

3. **Run the Application**:
   - Right-click the project and select `Run`.
   - Alternatively, run `ant run` in the terminal.
   - The program will output analysis for each ticket and announce the winner.

## Sample Output
```
Analyzing: 12-34-56-78-90
Digit Sum: 36, Digit Average: 3.6
Analyzing: 33-44-11-66-22
Digit Sum: 29, Digit Average: 2.9
Analyzing: 01-02-03-04-05
Digit Sum: 15, Digit Average: 1.5
The winning number with the highest average is: 12-34-56-78-90 with an average of 3.6
```

## Project Structure
- `src/chapter1_challenge_1_2/Chapter1_Challenge_1_2.java`: Main class containing the analysis logic.
- `build.xml`: Ant build script for compiling and running the project.
- `manifest.mf`: Manifest file for the JAR.
- `nbproject/`: NetBeans project configuration files.

## License
This project is for educational purposes. Feel free to modify and distribute as needed.
