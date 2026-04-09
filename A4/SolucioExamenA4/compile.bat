@echo off
REM Compiler script for Pokedex Java project
REM This script compiles all Java files

echo Compilando archivos Java...
javac -d bin src/Model/*.java src/Vista/*.java src/App.java

if %ERRORLEVEL% == 0 (
    echo.
    echo ======================================
    echo Compilacion exitosa!
    echo Ejecutar con: java -cp bin App
    echo ======================================
    echo.
) else (
    echo.
    echo ERROR: La compilacion ha fallado.
    echo Asegurate de tener un JDK instalado y javac en el PATH.
    echo.
)

pause
