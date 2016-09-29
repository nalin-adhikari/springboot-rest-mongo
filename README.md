# SpringBoot REST with MongoDB
Clone this project to your local workspace.<br/>
`cd \path\to\project`<br/>
`gradle eclipse`<br/>
Import this project to eclipse.

##Mongodb Configuration:
* Download [Mongo DB](https://www.mongodb.com/download-center)<br>
* Connect to Mongo DB<br>
* `use contactbook` to create new database in Mongo DB<br>
* `db.createUser({ user: "contactbook", pwd: "contactbook", roles: [ { role: "readWrite", db: "contactbook"} ] })` to create user

###API

```Base URI : [http://localhost:8080](http://localhost:8080)```

#### Test
```URI : /```<br/>
```Request Method : GET```

#### Get All Persons
```URI : /persons/```<br/>
```Request Method : GET```

#### Get One Person
```URI : /persons/{id}```<br/>
```Request Method : GET```

#### Add All Persons
```URI : /persons/```<br/>
```Request Method : POST```<br/>
```Request Body : List<Person>```

#### Add One Person
```URI : /persons/```<br/>
```Request Method : POST```<br/>
```Request Body : Person```