from flask import Flask, jsonify

app = Flask(__name__)

@app.route("/faculdade", methods=["GET"])
def faculdade():
    return jsonify({
        "faculdade": "UniLaSalle-RJ"
    })

@app.route("/curso", methods=["GET"])
def curso():
    return jsonify({
        "curso": "Sistemas de Informação"
    })

@app.route("/aluno", methods=["GET"])
def aluno():
    return jsonify({
        "aluno": "Pedro Coutinho Duarte"
    })

@app.route("/idiomas", methods=["GET"])
def idiomas():
    return jsonify({
        "idiomas": ["Inglês", "Espanhol", "Português"]
    })

# Rota agregada
@app.route("/sobre", methods=["GET"])
def sobre():
    return jsonify({
        "faculdade": "UniLaSalle-RJ",
        "curso": "Sistemas de Informação",
        "aluno": "Pedro Coutinho Duarte",
        "idiomas": ["Inglês", "Espanhol", "Português"]
    })

if __name__ == "__main__":
    app.run(debug=True)
