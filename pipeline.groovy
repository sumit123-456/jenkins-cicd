pipeline {
    agent any 
    stages {
        stage('Stage 1') {
            steps {
                git branch: 'main', credentialsId: '06778837-c2de-4c34-bf8a-d60ea48c811b', url: 'https://github.com/sumit123-456/jenkins-cicd.git'
            }
        }
         stage('pull') {
            steps {
                echo "pull successful"
            }
         }
        stage('Test') {
            steps {
                echo "Test successful"
            }
        }
         stage('Delivery') {
            steps {
                echo "Delivery successful"
            }
        }
    }
}

       
            
            
