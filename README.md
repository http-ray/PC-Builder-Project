PC Builder (Java OOP Project)
This project is a simple Object-Oriented Programming (OOP) exercise in Java that models a custom PC build.
It demonstrates composition by combining multiple classes: Case, Motherboard, Monitor, Resolution, and Sizes into a single PC object.

📂 Project Structure
src/AssembleComputer/
 ├── BuildOwnPC.java   # Main tester class
 ├── Case.java         # Represents the PC case (manufacturer, size, color)
 ├── Motherboard.java  # Represents motherboard (chipset, manufacturer, etc.)
 ├── Monitors.java     # Represents monitor (name, resolution, screen size)
 ├── Resolution.java   # Represents screen resolution (width x height)
 ├── Sizes.java        # Represents physical case dimensions
 └── PC.java           # Combines all components into a full PC
▶️ How to Run
Compile the code:

javac AssembleComputer/*.java
Run the program:

java AssembleComputer.BuildOwnPC
🖥️ Example Output
PC Specifications
-----------------

Case
* Manufacturer: NZXT
* Case size (inches): 8.94 X 18.27 X 17.56
* Color: White

Motherboard Specs
* Chipset: AMD B650
* Manufacturer: Asus

Monitor Specs
* Resolution: 1920 X 1080
* Screen Size: 27 inches
* Name: Samsung T35F
📘 Concepts Demonstrated
Classes & Objects
Composition (has-a relationship)
Encapsulation (getters & setters)
Method overriding (toString())
