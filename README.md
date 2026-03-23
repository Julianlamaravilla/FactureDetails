# Invoice Calculator - Java (Swing)

## Description

This project is a simple **Invoice Calculator** developed in **Java** using **JOptionPane (Swing)** for graphical user interaction. The program allows the user to enter an invoice name and two product prices, then calculates the **gross total**, **tax**, and **total amount after tax**.

The program includes basic exception handling to prevent invalid inputs such as non-numeric values.

---

## Features

* User input through dialog boxes
* Calculates:

  * Gross total
  * Tax (19%)
  * Total price after tax
* Error handling for invalid inputs
* Simple and user-friendly interface

---

## Technologies Used

* Java
* Java Swing (JOptionPane)

---

## How It Works

1. The program asks the user to enter the **invoice name**.
2. The user enters the **first price**.
3. The user enters the **second price**.
4. The program calculates:

   * Gross total = price1 + price2
   * Tax = total × 0.19
   * Total after tax = total + tax
5. The results are displayed in a dialog box.

---

## Formulas Used

| Concept         | Formula         |
| --------------- | --------------- |
| Gross Total     | price1 + price2 |
| Tax             | total × 0.19    |
| Total After Tax | total + tax     |

---

## How to Run the Program

1. Make sure you have **Java JDK** installed.
2. Compile the program:

   ```
   javac Main.java
   ```
3. Run the program:

   ```
   java Main
   ```

---

## Error Handling

The program handles the following exceptions:

* **InputMismatchException** → When the user enters invalid input
* **NumberFormatException** → When the user enters non-numeric values

If an error occurs, the program displays an error message and restarts automatically.

---

## Notes

This project is useful for practicing:

* Java input/output with Swing
* Exception handling
* Basic arithmetic operations
* Program flow control

---

## Author

Developed as a basic Java practice project to strengthen programming fundamentals and GUI interaction using Swing.
