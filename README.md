# springboot-rest-mongo
Clone this project to your local workspace.<br/>
`cd \path\to\project`<br/>
`gradle eclipse`<br/>
Import this project to eclipse.

##Mongodb Configuration:
Download mongodb<br>
Connect to mongodb<br>
`use contactbook` to create new db in mongo<br>
`db.createUser({ user: "contactbook", pwd: "contactbook", roles: [ { role: "readWrite", db: "contactbook"} ] })` to create user

###API

```Base URI : http://localhost:8080```

#### Test
```URI : /```
```Request Method : GET```

#### Get All Persons
```URI : /persons/```
```Request Method : GET```

#### Get One Person
```URI : /persons/{id}```
```Request Method : GET```

#### Add All Persons
```URI : /persons/```
```Request Method : POST```
```Request Body : List<Person>```

#### Add One Person
```URI : /persons/```
```Request Method : POST```
```Request Body : Person```