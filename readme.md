# Flexible Notification System with WhatsApp Integration

**Assignment:** Assignment 5 – Flexible Notification System (Maintenance Enhancement)

---

# Project Overview

This project demonstrates the use of **Composition** to create a flexible notification system that allows different notification services to be selected at runtime.

The original system supported Email and SMS notifications. As part of a maintenance enhancement, a new **WhatsAppService** was added without modifying the existing `AlertSystem` class or the `NotificationMedium` interface. This approach preserves the original system while extending its functionality through composition.

---

# Features

* Email notifications
* SMS notifications
* WhatsApp notifications
* Runtime switching between notification services
* Composition-based design
* JavaDoc documentation included
* AI usage documentation included

---

# Project Structure

```
FlexibleNotificationSystem_WhatsApp/

├── AlertSystem.java
├── NotificationMedium.java
├── EmailService.java
├── SMSService.java
├── WhatsAppService.java
├── MaintenanceTest.java
├── AI_Documentation.txt
├── doc/
│   ├── index.html
│   ├── AlertSystem.html
│   ├── WhatsAppService.html
│   └── ...
└── README.md
```

---

# Software Requirements

* Java Development Kit (JDK) 17 or later
* Command Prompt, PowerShell, or Terminal
* Visual Studio Code (optional)

---

# Deployment Instructions

## Step 1 – Download the Project

download the repository as a ZIP file from GitHub and extract it.

---

## Step 2 – Open the Project

Navigate to the project folder using Command Prompt or Terminal.


---

## Step 3 – Compile the Project

Compile all Java source files:

```bash
javac *.java
```

If compilation is successful, Java will generate the corresponding `.class` files.

---

## Step 4 – Run the Program

Execute the test program:

java MaintenanceTest
```

The program will demonstrate notifications using Email, SMS, and WhatsApp services.

---

# JavaDoc Documentation

To regenerate the JavaDoc documentation:

```bash
javadoc -d doc *.java
```

After generation, open:

```
doc/index.html
```

using any web browser.

---

# AI Usage

Generative AI was used as a collaborative development tool to:

* Review the existing design
* Ensure the maintenance enhancement respected project constraints
* Verify Composition was used correctly
* Improve code documentation
* Assist with JavaDoc formatting
* Generate and refine project documentation

All generated content was reviewed, tested, and modified before submission.

Additional information is available in:

```
AI_Documentation.txt
```

---

# Maintenance Enhancement

The project satisfies the maintenance requirements by:

* Preserving the original `AlertSystem` class
* Preserving the original `NotificationMedium` interface
* Adding functionality only through the new `WhatsAppService` class
* Using the existing setter method to inject the new notification service at runtime

No existing functionality was modified.

---

# Author

Christopher Oji

---

