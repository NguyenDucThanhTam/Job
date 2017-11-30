var express = require("express");
var app = express();
var server = require("http").createServer(app);
var io = require("socket.io").listen(server);
var fs = require("fs");
server.listen(process.env.PORT || 3000);


REPORT 29/11/2017:

Completed:
    - Simple Client-Server JAVA Socket TCP
        + Server:
            . Wait Request from Client (always wait)
            . Accept Request 
            . Create new thread Receive - Send data to Client
        + Client:
            . Connect Server
            . Thread: Send data to Server
In Progress: 
    - Multithread Client-Server Java TCP 
        + Server: 
            - Accept Mul request to Clients
            - Creat new theads Receive - Send datas to Clients
            - Thread: client - client , client - server , client - clients : personal talk
            - Close Server
        + Client:
            - Send - Receive data to others Client
            - Exit Server
            
Not Start: 
    - Connect Server to Android App Chat
