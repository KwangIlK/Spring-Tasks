## API Specification
### Get all posts
- Method: GET
- URL: /api/posts
- Request: None
- Response:

```json
{
  {
    "createdAt": "2022-07-25T12:43:01.226062",
    "modifiedAt": "2022-07-25T12:43:01.226062",
    "id": 1,
    "title": "title2",
    "content": "content2",
    "author": "author2"
  },
  {
    "createdAt": "2022-07-25T12:43:01.226062",
    "modifiedAt": "2022-07-25T12:43:01.226062",
    "id": 2,
    "title": "title",
    "content": "content",
    "author": "author"
  }
  …
}
```
​
### Get a specific post
- Method: GET
- URL: /api/post/{id}
- Request: None
- Response:
```json
{
  "createdAt": "2022-07-25T12:43:01.226062",
  "modifiedAt": "2022-07-25T12:43:01.226062",
  "id": 1,
  "title": "title2",
  "content": "content2",
  "author": "author2"
}
```
​
### Post a new post
- Method: POST
- URL: /api/post
- Request:
```json
{
  "title": "title",
  "content": "content",
  "author": "author",
  "password": "password"
}
```
​
- Response:
```json
{
  "createdAt": "2022-07-25T12:43:01.226062",
  "modifiedAt": "2022-07-25T12:43:01.226062",
  "id": 1,
  "title": "title",
  "content": "content",
  "author": "author"
}
```
​
### Update a post
- Method: PUT
- URL: /api/post/{id}
- Request:
```json
{
  "title": "title2",
  "content": "content2",
  "author": "author2",
  "password": "password2"
}
```
​
- Response:
```json
{
  "createdAt": "2022-07-25T12:43:01.226062",
  "modifiedAt": "2022-07-25T12:43:01.226062",
  "id": 1,
  "title": "title2",
  "content": "content2",
  "author": "author2"
}
```
​
### Delete a post
- Method: DELETE
- URL: /api/post/{id}
- Request:
```json
{
  "password": "password"
}
```
​
- Response:
```json
{
  "success": true
}
```

## USECASEDIAGRAM
![image](https://github.com/KwangIlK/Spring-Tasks/assets/137765136/0b3080ad-560e-49a9-9fd6-d969fdb7b747)

