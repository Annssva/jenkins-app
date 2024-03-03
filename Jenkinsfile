pipeline {
    agent any
    tools {
        maven 'maven-3.8.3'
    }
    stages {
        stage('Checkout') {
            steps {
                script {
                    git branch: 'master', url: 'https://github.com/Annssva/jenkins-java-app.git'
                }
            }
        }
        stage('Build') {
            steps {
                script {
                    sh 'mvn clean package'
                }
            }
        }
    }
    post {
        success {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
    }
}
