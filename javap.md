
🏛️ CivisID: National ID Registry System

CivisID is a Java-based CLI application designed to simulate the backend workflows of a real-world national citizen registration and verification system. Built with a focus on accuracy, scalability, security, data integrity, and persistent storage, it goes far beyond traditional console-based programs.

While basic Java applications lose data upon exit, CivisID ensures permanent storage using CSV-based data files, making all records easily exportable, readable, and compatible with tools like Excel, Google Sheets, and government data platforms.

CivisID is designed to help the government maintain a centralized citizen database, enabling authorities to know essential details about each citizen—such as identity, age, address, phone number, and email—ensuring consistent and accurate record-keeping across departments.

Each citizen is assigned a unique CivisID Number, which is used to:

Verify authenticity of the user

Prevent duplicate registrations

Ensure secure access and identity validation

Track updates made by the citizen or the authorities

The application also collects email IDs and phone numbers, enabling the system to:

Deliver government schemes, subsidies, and welfare updates

Send important notifications, emergency alerts, and reminders

Maintain direct communication between public departments and citizens

Overall, CivisID replicates the fundamental features of national ID systems (similar to Aadhaar, SSN, etc.) by providing secure registration, validation, monitoring, and data persistence—all from a lightweight and efficient Java CLI environment.

🚀 Key Features

✅ 1. Dynamic & Context-Aware Relative Logic

The system intelligently adapts based on Gender and Marital Status:

Citizen TypeRelative PromptMarried MaleWife’s NameMarried FemaleHusband’s NameUnmarriedFather’s Name

This mirrors real government documentation patterns.

✅ 2. Secure 7-Digit Random National ID

Each citizen receives a non-sequential, unpredictable 7-digit ID, increasing anonymity and security.

✅ 3. Permanent CSV Data Storage

CivisID uses citizens.csv to store data persistently.

✔ Auto-creates CSV with headers ✔ Appends new data safely ✔ Readable in Excel/Sheets ✔ Follows structured, clean formatting

✅ 4. Full CRUD Management

The admin can:

Create new citizens

Read/Search by ID

Update name, address, pincode, etc.

Delete unwanted/invalid records

✅ 5. Comprehensive Data Capture

15+ fields are collected:

Full Name

Age

DOB

Gender

Relative Name

Address

Pincode

State

Mother Tongue

Family Members

ID Proof

Phone

Email

National ID

Registration Timestamp

🛠️ Tech Stack Component Technology Purpose

Language Java (JDK 8+) Secure, portable, enterprise-grade

Data Structure HashMap<String, Citizen> O(1) fast retrieval of records

OOP Encapsulation Protects data integrity

File I/O FileWriter Persistent CSV storage

Error Handling try-catch Prevents crashes and invalid data

National-ID-System/

│ ├── Citizen.java # Model class for citizen data (POJO)

├── FileHandler.java # Handles CSV file creation & data writing

└── NationalIDApp.java # Main controller (menu, scanner, hash map, CRUD)

⚙️ How to Run

1️⃣ Clone the Repository

https://github.com/udayraj-rgb/CivisID-National-ID-Registry-System-24BCE11159.git

2️⃣ Compile All Java Files

javac *.java

3️⃣ Run the Application

java NationalIDApp

📊 Sample CSV Output

National IDNameAgeGenderRelationPhoneEmail7829103Rahul Sharma34MaleWife: Priya9876543210rahul@gov.in1928374Aditi Rao29FemaleFather: Raj9123456789aditi@gov.in

🔮 Future Enhancements

JavaFX/Swing GUI for a modern desktop interface

MySQL/PostgreSQL with JDBC for large-scale government usage

Biometric Hashing (SHA-256 simulation)

Cloud Sync via REST APIs (Firebase/AWS)

Advanced Search & Filtering

👨‍💻 Developed By

[Udayraj Patil] National ID System — Educational Prototype for e-Governance Concepts