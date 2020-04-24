const express = require('express')
const bodyParser = require('body-parser')
const cors = require('cors');
const mongoose = require('mongoose');

// const MongoClient = require('mongodb').MongoClient;

const app = express()
const port = 3000

// Connection URL
const url = 'mongodb://localhost:27017/test';
// Database Name


mongoose.connect(url, {
  useNewUrlParser: true,
  useUnifiedTopology: true
});

const UserSchema = new mongoose.Schema({
    name: { type: String, default: '' },
    salary: { type: Number, min: 10000, index: true },
    date: { type: Date, default: Date.now }
  });
const UserModel = mongoose.model('UserModel', UserSchema);




// parse application/json
app.use(bodyParser.json())
app.use(cors())

app.get('/', (req, res) => res.send('Hello World!'))

let users = [
    {name:'Ravi', salary: 34334}
]

app.get('/users', (req, res)=>{
    res.json(users)
})

app.post('/users', (req, res)=>{
    let user = req.body;
    // users.push(user);
    const obj = new UserModel();
    obj.name = user.name;
    obj.salary = user.salary;

    obj.save((error, result)=> {
        res.status(201).end();
    })

  //
});

   
    
    // res.json(users)



app.listen(port, () => console.log(`Example app listening at http://localhost:${port}`))

module.exports = {
    app
};


 // MongoClient.connect(url, function(err, client) {
    //     console.log("Connected successfully to server");
    //     const db = client.db(dbName);
    //     const collection = db.collection('users');
    //     collection.insertOne(user, (error, result)=>{
    //         if(error) throw error;
    //         console.log(result);
    //         res.status(201).end();
    //     });
    //   });
