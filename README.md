# mac-graphql

```
{
    "query":"mutation { createUser(name: \"Mac\", age: 29) { id name age} }"
}

curl -X POST \
  http://localhost:8080/graphql/ \
  -H 'Content-Type: application/json' \
  -H 'Postman-Token: 937d12c7-15f4-446e-856d-a8b533130ac6' \
  -H 'cache-control: no-cache' \
  -d '{
    "query":"mutation { createUser(name: \"Mac\", age: 29) { id name age} }"
}'
```

```
{
	"query":"{findAllUsers { id name age} }"
}

curl -X POST \
  http://localhost:8080/graphql/ \
  -H 'Content-Type: application/json' \
  -H 'Postman-Token: 8c5cf59f-f210-45b8-90e1-9ab91c9a8633' \
  -H 'cache-control: no-cache' \
  -d '{
	"query":"{findAllUsers { id name age} }"
}'
```
