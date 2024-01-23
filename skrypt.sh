#!/bin/bash

if  [ "$#" -eq 0  ]; then
	echo "Brak przekazanych argumentów" 
else
	echo "Przekazano argumenty: "
for arg in "$@"
do
	echo "$arg"
	done
fi
 
