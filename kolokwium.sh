#!/bin/bash
mkdir $1
cd $1
git init
git remote add origin https://github.com/pjatk-S31320/test.git
cp ./../rozwiazanie.sh ./
cp ./../rozwiadanie_config.sh ./
touch ReadMe.MD
echo "Numer indeksu: s31320": > ReadMe.MD
git add .
git commit -m "First commit"
git checkout -b Test
touch Add.txt
touch Skip.txt
head -10 kolokwium.sh > Add.txt
tail -10 kolokwium.sh > Skip.txt
touch gitignore
echo "Skip.txt" > gitignore
git add .
git commit -m "Test commit"
git push orgin Test
git checkout master
git push orgin master

