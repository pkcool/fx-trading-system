#!/bin/bash

#Define the folders in which we will run `yo jhipster:import-jdl entities.jh`

apps=("gateway" 
"fx-price-service")
for app in "${apps[@]}";
do
    ( cd ../$app && yo jhipster:import-jdl entities.jh )
done