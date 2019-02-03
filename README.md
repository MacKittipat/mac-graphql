# mac-graphql

```
{
	"query":"{findAllUsers { id name age} }"
}

{
	"query":"{findAllPosts { id title user {id name} } }"
}

{
    "query":"mutation { createUser(name: \"Mac\", age: 29) { id name age} }"
}

{
    "query":"mutation { createPost(title: \"Fist post\", user: 1) { id title user { id } } }"
}


```
