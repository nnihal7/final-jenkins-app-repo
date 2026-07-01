pipeline {
   agent any
   stages { 
     stage ('PULL STAGE') {
       steps {
         git '
