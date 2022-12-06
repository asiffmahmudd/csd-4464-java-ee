# A page with a form where users have to input information. must have at least 3 fields for the user to fill out [3]: 
- Created the "productForm.html" template with a form for adding product with 4 fields
	
# Form must be validated on the server side (for every field) [4]
- In "Product.java" file used "javax.validation.constraints" annotations for server-side validation for each field

# contents from the form should be persisted if it passes validation (saved into a database) [8]
- Created a MongoDB database for storing data and the credentials are in the "application.properties" file. Saved the data upon form submission

# A page that users can go to that lists the items created from the form in requirement 1 using Templates/Thymeleaf [6]
- Created "productlist.html" page for viewing added products through the form

# must take an optional get param to filter the list by an attribute  [4]
- created an api to get the list of products from the database. Currently I have added 5 departments(Grocery, Dairy, Meat, Fish, Other).
  Use url "http://localhost:8080/products?department=Grocery" to get the products from "Grocery" department

# There must be an API that returns the number of page hits since the server was online

# This api should be called asynchronously every 3 seconds and the results displayed on every page [7]
- created a js file in the static/js/scripts.js path. it has the code for asynchronously calling the api for updating the page hit count

# There must be at-least 1 dependency injected into two different locations in the project [4]
- HitCounter have been injected in "ProductController.java" and "HitCountController.java" through @Autowired annotation

# use of lombok in data classes [3]
- Used lombok annotations in "Product.java" class

# Classes should have unit tests [14]
- created "ProductControllerTest.java", "ProductTest.java", "HitCounterTest.java" for testing different classes













