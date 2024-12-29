pipeline {
    agent any
    

    stages {
        stage('Clone Repo') {
            steps {
               git branch: 'prod', credentialsId: 'GIT_Credentials', url: 'https://github.com/vilas639/bluegreen.git'
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
            }
        }
        stage('Docker Push') {
            steps {
      
    sh "docker login -u vilasjdhv639 -p Vilas@123"
sh "docker push push vilasjdhv639/bluegreen:v3"
       
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



