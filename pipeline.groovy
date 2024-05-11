pipeline {
    agent any

    stages {
        stage('Git') {
            steps {
                git branch: 'main', credentialsId: '06778837-c2de-4c34-bf8a-d60ea48c811b', url: 'https://github.com/sumit123-456/jenkins-cicd.git'
            }
        }
        stage('Build') {
            step {
            echo "Build successfully"
    }
}
        stage('Test') {
            step {
            echo "Test successfully"

    }
} 
        stage('Deploy') {
            step {
            echo "Deploy successfully"
    }
}
       
            
            
