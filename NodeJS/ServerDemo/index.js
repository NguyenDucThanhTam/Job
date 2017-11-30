var express = require("express");
var app = express();
var server = require("http").createServer(app);
var io = require("socket.io").listen(server);
var fs = require("fs");
server.listen(process.env.PORT || 3000);

//Array content User ID 
	var arrayUser = [];

//
var checkUser = true;

// app.get("/", function(req, res){
// 	res.sendFile(__dirname + "/"+"index.html");
// });

// Test Running Server
console.log("server is running");

io.sockets.on('connection', function(socket){
	console.log('Have device connected');

	// socket.on('client-send-data', function(data){
	// 	console.log("Server recived:"+data);
	// 	io.sockets.emit('Server-Send-Data',{ name: data});
	// });

	//NOTE: Recive data register from client
	socket.on('Client-Create-User', function(dataRegister){
		
		//Check Duplicate user
		//NOTE: check null user		
		if(arrayUser.indexOf(dataRegister) == -1){
			arrayUser.push(dataRegister);		
			checkUser = false;				
			console.log("Registed User: "+dataRegister);
			//NOTE: Send List User to all 
			io.sockets.emit('Server-Send-List-User', {listuser : arrayUser});		
		}
		else{
			console.log("Server-Duplicate-User: "+dataRegister);
			checkUser = true;
		}
		//Emit Only User register in now
		socket.emit('Server-Send-Registed',{registered : checkUser});
		
	});


});


