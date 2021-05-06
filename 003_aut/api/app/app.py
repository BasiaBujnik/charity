from flask import Flask, jsonify
from flask_cors import cross_origin
from flask_basicauth import BasicAuth

app = Flask(__name__)

app.config['BASIC_AUTH_USERNAME'] = 'user'
app.config['BASIC_AUTH_PASSWORD'] = 'pass'
basic_auth = BasicAuth(app)


@app.route('/')
def hello_world():
    return 'Hello, World!'

#iwr -Uri 'http://localhost:5000/todos' -Headers @{ Authorization = "Basic "+ [System.Convert]::ToBase64String([System.Text.Encoding]::ASCII.GetBytes("user:pass")) }
#Invoke-WebRequest -Uri http://localhost:5000/todos -Method GET
@app.route('/todos',methods=["GET"])
@cross_origin()
@basic_auth.required
def todos():
    response = jsonify(title="todos from local backend")
    return response

#Invoke-WebRequest -Uri http://localhost:5000/post -Method POST
@app.route("/post", methods=["POST"])
@basic_auth.required
@cross_origin()
def post_example():
    """POST in server"""
    return jsonify(message="POST request returned")