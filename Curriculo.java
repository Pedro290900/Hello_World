from flask import Flask

app = Flask(__name__)

@app.route("/faculdade")
def func():
  return 'UniLaSalle-RJ'

@app.route("/Curso")
def curso():
  return 'Sistemas de informação'

@app.route("/Aluno")
def Aluno():
  return 'Pedro Coutinho Duarte'

@app.route("/idiomas")
def idiomas():
  return 'Inglês, Espanhol e Português'
  
if __name__ == '__main__':
  app.run(debug=True)
