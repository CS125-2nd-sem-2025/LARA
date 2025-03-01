# First make sure you have:
-Python 3 <br/>
-Any code editor (VS Code, Sublime, etc.)

## Setting Up
-First, open your CMD by typing "CMD" on your system's search bar (usually found on the bottom left) <br/>
-Type these into your CMD: 
```
mkdir name_of_folder_api
cd name_of_folder_api
python -m venv venv
venv\Scripts\activate
pip install flask
```
## Creating the API
-Open your code editor (in this case, VS Code) by typing `code .` in your CMD <br/>
-Create a new file `app.py` in your newly made directory (name_of_folder_api) <br/>
-Copy the script I have provided for this exercise

## Running the Program
-On your CMD, type `python app.py` <br/>
-This should run the file, providing you with your localhost server
```
* Running on all addresses (0.0.0.0)
 * Running on http://xxx.x.x.x:5000
 * Running on http://xxx.xxx.xx.xxx:5000 (this is your localhost server)
Press CTRL+C to quit
 * Restarting with stat
 * Debugger is active!
 * Debugger PIN: 308-083-944
```
-Take note of your server as this will be used to test the program

## Testing the Program
-Without closing the CMD containing the information to your localhost server, open a new CMD <br/>
-Run the following commands to get different information about your system
```
curl http://xxx.xxx.xx.xxx:5000/ip (to get your IP address)
curl http://xxx.xxx.xx.xxx:5000/os (to get your OS)
curl http://xxx.xxx.xx.xxx:5000/version (to get your system version)
curl http://xxx.xxx.xx.xxx:5000/all (to display all three aforementioned information at once)
```



