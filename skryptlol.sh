#!/bin/bash/
if ! [[ $# -eq 3]]
then
echo "Podana niepoprawna ilosc argumentow"
exit 1
fi
if ! [[ $1 == "Rozwiazanie" ! $1 == "Test"]]
then echo "pierwszy argument musi byc Rozwiazanie albo Test"
exit 2 
fi
if ! [[ $2 == *.txt]]
then
echo "drugi parametr musi miec rozszerzenie .txt"
exit 3
fi
if ! [[ $3 == [1||2]+ ]]
echo "Trzeci parametr musi byc liczba calkowita"
exit 4
fi
if [[ $1 == "Rozwiazanie" ]]
then
mkdir Kolokwium Kolokwium/'Zadania UKOS' Kolokwium/'Zadania UKOS'/'Zadanie 1' Kolokwium/'Zadania UKOS'/'Zadanie/Rozwiazanie 1
mkdir Kolokwium/'Zadania UKOS'/'Zadanie 1'/rozwiazanie/$2 
echo " SSD 480 250
Dane:
SSD 480 250
HDD 830 310
M2 530 180
SSD 390 280
HDD 640 190
SSD 880 290
M2 890 320
M2 440 220
HDD 270 190
SSD 540 200
HDD 920 170
M2 790 310
HDD 320 280
M2 620 220
SSD 840 340
HDD 380 240
M2 940 330
SSD 600 270
M2 480 170
HDD 450 220
SSD 890 200
HDD 930 320
M2 820 190
SSD 270 270
HDD 750 180
M2 390 170
HDD 670 340
M2 220 330
SSD 300 210
HDD 350 330
SSD 410 170
M2 250 280
HDD 890 270
SSD 740 220
M2 580 230
SSD 480 260
M2 690 330
HDD 700 330
M2 980 260
HDD 960 220
SSD 970 240
HDD 420 310
M2 540 190
SSD 880 240
HDD 620 330
M2 200 220
SSD 340 270 " > Kolokwium/'Zadania UKOS'/'Zadanie 1'/Test/$2
mkdir Kolokwium Kolokwium/'Zadania UKOS'Kolokwium/'Zadania UKOS'/'Zadanie 1' Kolokwium/'Zadania UKOS'/'Zadanie 1'/Test
mkdir Kolokwium/'Zadania UKOS'/'Zadanie 1'/Rozwiazanie/$2
echo "SSD 480 250
Dane:
SSD 480 250
HDD 830 310
M2 530 180
SSD 390 280
HDD 640 190
SSD 880 290
M2 890 320
M2 440 220
HDD 270 190
SSD 540 200
HDD 920 170
M2 790 310
HDD 320 280
M2 620 220
SSD 840 340
HDD 380 240
M2 940 330
SSD 600 270
M2 480 170
HDD 450 220
SSD 890 200
HDD 930 320
M2 820 190
SSD 270 270
HDD 750 180
M2 390 170
HDD 670 340
M2 220 330
SSD 300 210
HDD 350 330
SSD 410 170
M2 250 280
HDD 890 270
SSD 740 220
M2 580 230
SSD 480 260
M2 690 330
HDD 700 330
M2 980 260
HDD 960 220
SSD 970 240
HDD 420 310
M2 540 190
SSD 880 240
HDD 620 330
M2 200 220
SSD 340 270 " > Kolokwium/'Zadania UKOS'/'Zadanie 1'/Tekst/$2
fi
mkdir Kolokwium/'Praca inzynierska'
touch Kolokwium/'Praca inzynierska'/SSD.txt Kolokwium/'Praca inzynierska/HDD>
egrep "SSD" > Kolokwium/'Praca inzynierska'/SSD.txt
egrep "HDD" > Kolokwium/'Praca inzynierska'/HDD.txt
egrep "M2" >Kolokwium/'Praca inzynierska' / MP2.txt

 
