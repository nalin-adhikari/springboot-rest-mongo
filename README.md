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

#### Test API
```http://localhost:8080/```