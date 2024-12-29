pipeline {
    agent any
    

    stages {
        stage('Clone Repo') {
            steps {
               // git 'https://github.com/ashokitschool/maven-web-app.git'
               echo "clone repo"
            }
        }
        stage('Maven Build') {
            steps {
               // sh 'mvn clean package'
               echo "mvn clean pacakage"
            }
        }
        stage('Docker Image') {
            steps {
                //sh 'docker build -t ashokit/mavenwebapp .'
                echo "build docker images"
            }
        }
        stage('Docker Push') {
            steps {
              // withCredentials([string(credntialsId: 'dockerhubpwd', variable: 'dockerpwd')])
//{
//sh "docker login -u ashokit -p ${dockerpwd}"
//sh "docker push ashokit/app1"
//}          
          echo "k8s deployment"  
        }
        }

        stage('k8s deployment') {
            steps {
