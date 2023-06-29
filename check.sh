#!/bin/bash

declare -i currentFileSize
declare -i latestFileSize
declare -i retFileSize

getFileSize() {
 retFileSize=$(ls -S -l /Users/preetheldhose/eclipse-workspace/Bismillah_AID/src/main/java/test/interview/testInterview.java | awk '{print $5}')
 echo $retFileSize
 return $retFileSize
}

echo
echo
echo "Filesize to start with".$currentFileSize
latestFileSize=$(getFileSize)
echo "LatestFileSize".$latestFileSize
currentFileSize=$latestFileSize
echo "currentFileSize".$currentFileSize

while true
do

 if [[ "$latestFileSize" -eq "$currentFileSize" ]]; 
 then
    echo "Values has not changed"
    latestFileSize=$(getFileSize)
    echo "LatestFileSize".$latestFileSize
    echo "currentFileSize".$currentFileSize
 else 
    echo "Values changed"
    echo "oops currentFileSize".$currentFileSize
    echo "existing LatestFileSize value".$latestFileSize
    ./execute.sh
    echo "About to execute bash script"
    echo "About to execute file check"
    currentFileSize=$latestFileSize
    echo "currentFileSize".$currentFileSize
 fi

 sleep 5;
 echo
 echo

done
