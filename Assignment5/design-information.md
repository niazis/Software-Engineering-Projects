```
Muhammad Niazi
370
```
1.	As a user of the system I want to be able to see each store's offering and the amount of product in stock by square feet. So I added search, floor_type and floor_category so user can select what I want.

2.	The application must allow employees to add new products as well as delete and edit them. In the same class as the previous one, I will implement three methods. One method would be called add_item which adds the product, one called remove_item which would delete a product and one called edit_item which would edit the product. 

3.	The different categories of floors available are tile, stone, wood, laminate and vinyl. I created a class called floor categories which has the types of floor in it. This class lets is connected to the Floor class.

4.	The application must contain a database of floors. I made a database called inventory that has the information for each of the product. The database contains the product information and the quantity of each product. 

5.	Users must be able to search for products by picking from a hierarchical list, where the first level is the floor category, and the second level is the floor type. I made a User class that first selects as product category using the selectfloorcategory method. Once it has selected the floor category it then selects the type for that specific category. For that I have made a selectfloortype method.

6.	Users must also be able to specify an item by typing its name (search functionality). I have created a method called Search_Product. The User can search for that product and see its information.

7.	All floors regardless of their category have an associated color, size, brand, type and price. For that I have created a class called Floor. This class stores the basic information such as color, size, brand, type and price as parameters. When a user selects a floor, all of this information is just parsed from the database.

8.	Categories tile and stone have different materials they are made of, e.g. Tile - porcelain, ceramic, resin; Stone - marble, pebble, slate. I have made additional attributes in the Floor class. One of them is materials. When a user selects tile or stone and the selects the type, this information is parsed in the floor class from our inventory. I also made additional class for the floor_type so that it can return value to floor class

9.	Wood floors have a type (solid, engineered, bamboo, etc) and species (oak, hickory, maple, etc.) Type and species are additional attributes I have included in the floor class. Once selected, it adds the type to the floor class. Same thing for floor species.

10.	Laminate can be regular laminate or water resistant, whereas vinyl can be water resistant or waterproof. I have added these attributes to the Floor class so when user selects material they can select water resistant, water proof or regular laminate.