from flask import Flask, request, jsonify
import platform
import socket
import os

app = Flask(__name__)

@app.route('/os', methods=['GET'])
def retrieve_operating_system():
    system_information = platform.system()
    return jsonify({"os": system_information})

@app.route('/version', methods=['GET'])
def retrieve_version():
    system_version = platform.version()
    return jsonify({"version": system_version})

@app.route('/ip', methods=['GET'])
def retrieve_ip():
    visitor_address = request.remote_addr
    return jsonify({"ip": visitor_address})

@app.route('/all', methods=['GET'])
def retrieve_all_info():
    system_information = platform.system()
    system_version = platform.version()
    visitor_address = request.remote_addr
    
    return jsonify({
        "os": system_information,
        "version": system_version,
        "ip": visitor_address
    })

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000, debug=True)
