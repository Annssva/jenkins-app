pipeline {
    agent any
    environment {
        DOCKER_IMAGE = 'maven:3.8.3'
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
                    docker.image(DOCKER_IMAGE).inside {
                        sh 'mvn clean package'
                    }
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
