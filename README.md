# Android-Application-Project1-Checkbox

![image](https://github.com/user-attachments/assets/1a8559f8-86a0-4730-a0e1-5a949ecb5a1c)


![image](https://github.com/user-attachments/assets/5bc0576c-7e21-4c88-a39f-6d9027ccfa85)


# Android Checkbox Example

This is a simple Android application that demonstrates the use of `CheckBox` widgets in a user interface using **RelativeLayout**. The app allows users to select multiple checkboxes and perform an action by clicking a button.

## 🧩 Features

- Four `CheckBox` widgets labeled with:
  - Painting
  - Drawing
  - mad_experiment_2_2
  - checkbox
- A `Button` labeled "Check" to trigger logic based on selected checkboxes (can be implemented in `MainActivity.java`).

## 🛠️ Built With

- Android Studio
- Java
- XML Layout (RelativeLayout)

## 📁 Project Structure

📦checkbox
┣ 📂app
┃ ┣ 📂src
┃ ┃ ┣ 📂main
┃ ┃ ┃ ┣ 📂java
┃ ┃ ┃ ┃ ┗ 📜MainActivity.java
┃ ┃ ┃ ┣ 📂res
┃ ┃ ┃ ┃ ┣ 📂layout
┃ ┃ ┃ ┃ ┃ ┗ 📜activity_main.xml
┃ ┃ ┃ ┃ ┣ 📂values
┃ ┃ ┃ ┃ ┃ ┗ 📜strings.xml
┃ ┃ ┃ ┗ 📜AndroidManifest.xml

bash
Copy
Edit

## 📸 Screenshots

| App UI |
|--------|
| ![screenshot](screenshots/checkbox_ui.png) |

## 🚀 Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/android-checkbox-example.git
Open in Android Studio:

Open Android Studio → File → Open → Navigate to the project directory.

Build and Run:

Connect an emulator or Android device.

Click the Run button ▶️.

📄 How it Works
The layout file activity_main.xml defines four checkboxes and one button using RelativeLayout. Each checkbox has a unique ID and is placed below the previous one.

The button with the onClick="Check" attribute calls a method in MainActivity.java when clicked. You can customize the Check() method to check which checkboxes are selected and perform any action accordingly.

java
Copy
Edit
public void Check(View view) {
    CheckBox cb1 = findViewById(R.id.checkBox);
    CheckBox cb2 = findViewById(R.id.checkBox2);
    CheckBox cb3 = findViewById(R.id.checkBox3);
    CheckBox cb4 = findViewById(R.id.checkBox4);

    StringBuilder result = new StringBuilder("Selected:\n");
    if (cb1.isChecked()) result.append("Painting\n");
    if (cb2.isChecked()) result.append("Drawing\n");
    if (cb3.isChecked()) result.append("mad_experiment_2_2\n");
    if (cb4.isChecked()) result.append("checkbox\n");

    Toast.makeText(this, result.toString(), Toast.LENGTH_SHORT).show();
}
📌 TODO
Implement logic inside the Check() method.

Add more functionality based on checkbox selection.

Improve the UI using Material Components.

📜 License
This project is licensed under the MIT License - see the LICENSE file for details.

Created with ❤️ using Android Studio

yaml
Copy
Edit

---

You can rename the repository something like `android-checkbox-example` and place the screenshot image in a folder named `screenshots/checkbox_ui.png`, or update the path accordingly. Let me know if you'd like me to help generate the Java code for the button functionality too.

