pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                git branch: 'main', credentialsId: '06778837-c2de-4c34-bf8a-d60ea48c811b', url: 'https://github.com/sumit123-456/jenkins-cicd.git'
            }
        }
    }
}