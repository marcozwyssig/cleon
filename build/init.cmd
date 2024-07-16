:: Define the virtual environment directory
set VENV_DIR=myenv

:: Create the virtual environment if it doesn't exist
if not exist "%VENV_DIR%" (
  python -m venv "%VENV_DIR%"
)

:: Activate the virtual environment
call "%VENV_DIR%\Scripts\activate"

:: Install required packages
python.exe -m pip install --upgrade pip
pip install -r requirements.txt

:: Keep the virtual environment activated (for demonstration purposes, otherwise you can deactivate)
cmd
