pipeline {
    agent any
    

    stages {
        stage('Clone Repo') {
            steps {


               git branch: 'prod', credentialsId: 'GIT_Credentials', url: 'https://github.com/vilas639/bluegreen.git'
               // git 'https://github.com/ashokitschool/maven-web-app.git'


               // git 'https://github.com/ashokitschool/maven-web-app.git'

               echo "clone repo"
            }
        }
        stage('Maven Build') {
            steps {
                sh 'mvn clean package'
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
               sh 'docker build -t vilasjdhv639/bluegreen:v3 .'
               echo "build docker images"
               // sh 'mvn clean package'
              
            }
        }
      
        stage('Docker Push') {
            steps {

      
    sh "docker login -u vilasjdhv639 -p Vilas@123"
sh "docker push vilasjdhv639/bluegreen:v3"
       
          echo "Docker Push"  

            }

        }

        }

        stage('k8s deployment') {
            steps {

                  sh "kubectl apply -f 01_blue-deployment.yml"
  sh "kubectl apply -f 02_live-service.yml"
         echo "k8s deployment"  

            }
            }

}
}
}


