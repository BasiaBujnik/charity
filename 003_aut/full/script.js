document.getElementById('button1').addEventListener("click", function(event){
        getTextFromBackend('https://jsonplaceholder.typicode.com/todos/1');
    }); //we will change text for user - register binding for user action

document.getElementById('button2').addEventListener("click", function(event){
    getTextFromBackend('https://jsonplaceholder.typicode.com/todos/2');
}); //we will change text for user - register binding for user action

document.getElementById('button3').addEventListener("click", function(event){
    loadSearchResults('https://jsonplaceholder.typicode.com/todos/3');
}); //we will change text for user - register binding for user action


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
  xhttp.onreadystatechange = function() { //callback function, so function to be called when readyState changes
    if (this.readyState === CALL_SUCCESSFUL && this.status === HTTP_OK) { //successfully finished
       let xhttp = new XMLHttpRequest(); //scope xhttp to this block
       xhttp.open("GET", url, true); //async to
       xhttp.onreadystatechange = function(){ //if first request was successful we get entire user list and update in DOM
            document.getElementById('paragraph').innerText = `Response from backend \r ${url} is \r` + xhttp.responseText     };
       xhttp.send();
    }
  };
  xhttp.open("GET", url, true); //true makes it asynchronous call
  xhttp.send();
 }