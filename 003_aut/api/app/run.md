in powershell:
$env:FLASK_ENV='development';$env:FLASK_APP='app'; python -m flask run

to build dockerfile
docker build --tag python-docker .
docker run --rm --expose 5000:5000 python-docker

to test

Invoke-WebRequest -Uri http://localhost:5000/ -Method GET