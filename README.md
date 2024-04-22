# QR Code Generator
This QR Code Generator is implemented based on the concepts discussed in the blog post from [CoderScratchPad](https://coderscratchpad.com/javafx-qr-code-generation/). It utilizes JavaFX for the graphical interface and ZXing for QR code generation, providing a user-friendly way to generate and display QR codes.

## Features

- Generate QR codes with custom contents.
- Display QR codes in a JavaFX application window.
- Save QR codes as PNG images.

## Prerequisites

Before you can run this project, you must have the following installed:
- Java SDK (version 11 or higher)
- Maven (for dependency management and running the project)

## Setup

To get started with this project, clone the repository and navigate to the project directory:

```bash
git clone https://github.com/AbdelrahmanBayoumi/QR-Code-FX-Example.git
cd QR-Code-FX-Example
```

## Dependencies

The project uses the following dependencies:
- JavaFX (for the user interface)
- ZXing (for QR code generation)
- Maven (for building and running the project)

These dependencies are defined in the `pom.xml` file and will be automatically downloaded and configured by Maven.

## Usage

Upon running the application, a QR code will be generated and displayed based on the predefined string in the code. You can customize this string by modifying the `CONTENT_TO_ENCODE` constant in the `Main.java` file.
