# JAVA_Spring_Security_First_Project

This is a Spring Boot application using the Spring Security dependency.

It uses an ArrayList of quotation objects having two String properties: content and author.

Roles handled:
- user - getting quotations,
- moderator - getting quotations, adding new quotations,
- admin - getting quotations, adding new quotations, removing quotations.

Available requests:
- /api - GET - returns all quotations as JSON,
- /api - POST - returns boolean, add a new quotation by placing it in the request body,
- /api - DELETE - void, set the 'index' request parameter and remove the chosen quotation.

The withDefaultPasswordEncoder method has been used for training purposes.

The CSRF protection has been disabled, so you can use ex. Postman to send the requests.
