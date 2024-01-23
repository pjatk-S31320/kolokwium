#!/bin/bash
mkdir $1
cd $1
git init
git remote add origin git@github.com:pjatk-S31320/kolokwium.git
touch ReadMe.MD 
echo "23.01.2024r. kolokwium": > ReadMe.MD
git add .
git commit -m "Zadanie 6.F."
git checkout -b New_Function
touch main.txt
touch main.cpp
echo "Bad file :(" > main.txt
echo "Good file :)" > main.cpp
touch .gitignore
echo "main.txt" > .gitignore
git add .
git commit -m "Zadanie 6.L."
git push origin New_Function
git checkout master
touch .gitignore
echo "main.cpp" > .gitignore
git add .
git commit -m "Zadanie 6.Q."
git push origin master
