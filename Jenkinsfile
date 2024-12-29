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
        stage('Sonar Scan') {
            steps {
               // sh 'mvn clean package'
               echo "Sonar Scan"
            }
        }

     stage('Artifactory configuration') {
            steps {
               // sh 'mvn clean package'
               echo "Artifactory configuration"
            }
        }
         stage('Deploy Artifacts') {
            steps {
               // sh 'mvn clean package'
               echo "Deploy Artifacts"
            }
        }
        
        stage('Publish build info') {
            steps {
               // sh 'mvn clean package'
               echo "Publish build info"
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
          echo "Docker Push"  
        }
        }

        stage('k8s deployment') {
            steps {
         echo "k8s deployment"  

            }
            }

           


}
}



