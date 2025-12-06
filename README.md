# 📦 Online Shopping Application – @ConfigurationProperties (Spring Boot)

This Spring Boot project demonstrates how to use @ConfigurationProperties, PropertySource, and external .properties files to configure an Online Shopping Cart System.
It loads user information, cart details, quantities, items, coupons, and item-wise prices from a custom shopping.properties file.

---

✅ Features

Loads properties from shopping.properties

Uses @ConfigurationProperties(prefix = "cart")

Demonstrates:

Array (item quantities)

List (items in cart)

Set (discount coupons)

Map (item → price)

Displays complete cart details via a service class

---

# 📁 Project Structure

src/main/java

 └── com.shopping
 
      ├── ShoppingApp.java
      
      ├── config
      
      │     └── ShoppingCartProperties.java
      
      └── service
      
            └── ShoppingService.java

src/main/resources

 └── shopping.properties

---

# 🛒 Sample Output

Shopping Cart:

User            : Anita Sharma

Total Amount    : 4500


Item Quantities : 1 2 1 3

Items (List)    : [Laptop Bag, Mouse, Notebook, Pen Pack]

Coupons (Set)   : [NEW20, FESTIVE10, LOYAL5]

Prices (Map)    :

   Laptop Bag = 1200
   
   Mouse      = 600
   
   Notebook   = 150
   
   Pen Pack   = 100

---

# 📝 Technologies Used

Java 17+

Spring Boot

@ConfigurationProperties

Maven

---

# 👩‍💻 Author

Chaitali Shende
