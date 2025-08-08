# 📦 Inventory Management System (Java)

## 📌 Overview
हा एक साधा **Inventory Management System** आहे जो Java मध्ये लिहिला आहे.  
तो प्रॉडक्ट अॅड, अपडेट, डिलीट, सर्च आणि संपूर्ण इन्व्हेंटरी पाहण्याची सुविधा देतो.  
प्रोजेक्टमध्ये **Java Modules** (`module-info.java`) वापरलेले आहेत आणि `ProductNotFoundException` हा कस्टम Exception आहे.

---

## 🗂 Project Structure
src/
├── InventoryApp.java # Main application with menu
├── InventoryManagement.java # Inventory operations (CRUD)
├── Product.java # Product model class
├── ProductNotFoundException.java # Custom exception for not found products
├── module-info.java # Module declaration


---

## ⚙️ Requirements
- Java 17+ (Java Modules सपोर्टसाठी)  
- JDK installed आणि PATH मध्ये जोडलेले असणे आवश्यक

---

## ▶️ How to Compile & Run

1. **Compile**:
```bash
javac -d out src/module-info.java src/*.java


📖 Menu Options

1. Add Product       → नवीन प्रॉडक्ट नोंदवते
2. Update Product    → प्रॉडक्टची माहिती अपडेट करते
3. Delete Product    → प्रॉडक्ट डिलीट करते
4. Search Product    → प्रॉडक्ट ID ने शोधते
5. View Inventory    → संपूर्ण इन्व्हेंटरी दाखवते
6. Exit              → प्रोग्राम बंद करते

🛠 Example Usage
Welcome to Inventory Management System
1. Add Product
2. Update Product
3. Delete Product
4. Search Product
5. View Inventory
6. Exit
Choose an option: 1
Enter Product ID: 101
Enter Product Name: Laptop
Enter Product Price: 55000
Product added successfully!

