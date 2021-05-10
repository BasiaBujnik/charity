//register events
document.getElementById('button1').addEventListener("click", function(event){
        getTextFromBackend('https://jsonplaceholder.typicode.com/todos/1');
    }); //we will change text for user - register binding for user action

document.getElementById('button2').addEventListener("click", function(event){
    getTextFromBackend('https://jsonplaceholder.typicode.com/todos/2');
}); //we will change text for user - register binding for user action

document.getElementById('button3').addEventListener("click", function(event){
    loadSearchResults('https://jsonplaceholder.typicode.com/todos/3');
}); //we will change text for user - register binding for user action

document.getElementById('button4').addEventListener("click", function(event){
    loadSearchResults('http://localhost:5000/todos');
}); //we will change text for user - register binding for user action

document.getElementById('posts1').addEventListener("click", function(event){
    loadPosts('http://localhost:5000/posts');
}); //we will change text for user - register binding for user action

document.getElementById('addpost').addEventListener("submit", function(event){
    addPost('http://localhost:5000/post/add/newpost');
}); //we will change text for user - register binding for user action


//functions to serve events
function getTextFromBackend(url){ //the new text is coming from backend. network communication is involved
    fetch(url)
      .then(response => response.json())
      .then(data => {
        document.getElementById('paragraph').innerText = `Response from backend \r ${url} is \r` + data.title //actually use something to change content based on response
      });
}

function loadSearchResults(url) {
  const CALL_SUCCESSFUL = 4;
  const HTTP_OK = 200;
  var xhttp = new XMLHttpRequest();
  xhttp.responseType = 'json';
  xhttp.onreadystatechange = function() { //callback function, so function to be called when readyState changes
    if (this.readyState === CALL_SUCCESSFUL && this.status === HTTP_OK) { //successfully finished
            document.getElementById('paragraph').innerText = `Response from backend \r ${url} is \r` + xhttp.response.title
    }
    else if(this.readyState !== CALL_SUCCESSFUL){
            document.getElementById('paragraph').innerText = 'Backend unavailable'
     };
  };
  xhttp.open("GET", url, true); //true makes it asynchronous call
  xhttp.setRequestHeader("Authorization", "Basic " + btoa("user:pass"));
  xhttp.send();
 }

 function loadPosts(url){ //the new text is coming from backend. network communication is involved
    document.getElementById('paragraph').innerText = "Loading posts ..."
     fetch(url)
       .then(response => response.json())
       .then(data => {
         document.getElementById('posts').innerText = "";
         data.forEach(post => {
            if(post.title){
                var node = document.createElement("br");
                document.getElementById('posts').appendChild(node);
                document.getElementById('posts').innerText += post.title +' says ' + post.body //actually use something to change content based on response
            }
                document.getElementById('paragraph').innerText = "Loaded"
            }
         );
       });
 }
 function addPost(url) {
   const CALL_SUCCESSFUL = 4;
   const HTTP_OK = 201;
   var xhttp = new XMLHttpRequest();
   xhttp.responseType = 'json';
   xhttp.onreadystatechange = function() { //callback function, so function to be called when readyState changes
     if (this.readyState === CALL_SUCCESSFUL && this.status === HTTP_OK) { //successfully finished
             loadPosts('http://localhost:5000/posts');
     }
     else if(this.readyState !== CALL_SUCCESSFUL){
             document.getElementById('paragraph').innerText = 'Backend unavailable'
      };
   };
   xhttp.open("POST", url, true); //true makes it asynchronous call
   xhttp.setRequestHeader("Content-Type", "application/json");
   let title = document.getElementById('title').value;
   let body = document.getElementById('body').value;
   const post = {
        "body": body,
        "title": title
   }
   xhttp.send(JSON.stringify(post));
  }
