 
# Personal Account Management in Java

This Java project implements a simple **Personal Account Management** system, which allows users to deposit and withdraw money, check their balance, and view a history of transactions.

## Table of Contents
- [Project Description](#project-description)
- [Features](#features)
- [Classes and Methods](#classes-and-methods)
- [Requirements](#requirements)
- [Setup](#setup)
- [Running the Application](#running-the-application)
- [Testing](#testing)
- [Example Output](#example-output)
  
## Project Description

The **Personal Account Management** system allows users to manage their bank account by performing deposits, withdrawals, and reviewing transaction histories. Each transaction is recorded, and the balance is updated in real-time.

The project includes:
- A `TransactionType` enum to distinguish between deposits and withdrawals.
- An `Amount` class to store transaction details.
- A `PersonalAccount` class to handle account operations like deposit, withdraw, and track transactions.
- A `Main` class for testing the functionality.

## Features

- Create and initialize a personal account with an account number and account holder's name.
- Deposit money into the account.
- Withdraw money from the account, ensuring that the balance is not overdrawn.
- Retrieve the current balance.
- Print the complete transaction history (both deposits and withdrawals).

## Classes and Methods

### 1. `TransactionType` Enum
- **Constants**: 
  - `DEPOSIT`: Represents a deposit transaction.
  - `WITHDRAWAL`: Represents a withdrawal transaction.

### 2. `Amount` Class
- **Attributes**:
  - `amount (double)`: The transaction amount.
  - `transactionType (TransactionType)`: The type of transaction (either DEPOSIT or WITHDRAWAL).
  
- **Methods**:
  - `getAmount()`: Returns the transaction amount.
  - `getTransactionType()`: Returns the type of transaction (DEPOSIT or WITHDRAWAL).

### 3. `PersonalAccount` Class
- **Attributes**:
  - `accountNumber (int)`: A unique identifier for the account.
  - `accountHolder (String)`: The name of the account holder.
  - `balance (double)`: The current balance of the account.
  - `transactions (ArrayList<Amount>)`: A list to store deposit and withdrawal transactions.
  
- **Methods**:
  - `PersonalAccount(int accountNumber, String accountHolder)`: Constructor to initialize the account number, account holder, and set the initial balance to `0.0`.
  - `void deposit(double amount)`: Deposits the specified amount into the account and records the transaction.
  - `void withdraw(double amount)`: Withdraws the specified amount if the balance is sufficient and records the transaction.
  - `void printTransactionHistory()`: Prints the transaction history (both deposits and withdrawals).
  - `double getBalance()`: Returns the current balance.
  - `int getAccountNumber()`: Returns the account number.
  - `String getAccountHolder()`: Returns the account holder's name.

### 4. `Main` Class
- **Purpose**: 
  - This class contains test cases to demonstrate the functionality of the `PersonalAccount` class. The tests involve creating an account, depositing and withdrawing money, and viewing the transaction history.

