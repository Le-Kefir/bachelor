# Demo project for the bachelor thesis.

This source code is the backend part of the project. It is simple library application with basic CRUD operations. H2 is used as an in-memory database.
There are following API requests:


URL|Method|Input|Description|Return value
---|---|---|---|---
localhost:8080/lib/books/create|POST|JSON (request body)|takes JSON body and creates new book in DB ex. "title": "The Little Prince", "year": 1943, "author": "Antoine de Saint-Exupery")| boolean
localhost:8080/lib/books/{id}|GET|Long (path variable)|returns book with requested id|JSON
localhost:8080/lib/books/all|GET|-|returns list of all books| JSON Array
localhost:8080/lib/books/{id}|PUT|Long (path variable), JSON (request body)|updates requested book with new data sent in the body of the request| boolean
localhost:8080/lib/books/{id}|DELETE|Long (path variable)|deletes book from DB by id| boolean
localhost:8080/lib/books/deleteAll|DELETE|-|deletes all books from DB|boolean